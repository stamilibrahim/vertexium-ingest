import au.com.bytecode.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ibrahim on 3/10/17.
 */
public class BluerayParser {

    private Map<String, Integer> headerMapping = new HashMap<String, Integer>();
    private CSVReader reader = null;

    // class constructor
    public BluerayParser(){
        loadHeaderMapping("FMS_CSV_HEADERS.txt");
    }

    // load dataset headers and their index
    private void loadHeaderMapping(String fileName) {
        InputStream is = BluerayParser.class.getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        try {
            System.out.println("Loading headers. . . ");
            System.out.printf("%s\t%s", "Header", "Index");
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                this.headerMapping.put(fields[0].trim(), Integer.parseInt(fields[1].trim()));
                System.out.printf("%s\t%s", fields[0], fields[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Failed to close reader: " + e.toString());
            }
        }
    }

    //method to parse a line
    public BluerayCallEvent parseLine(String line) throws ParseException, InvocationTargetException,
            IllegalAccessException {

        String[] columns = line.split(",");
        BluerayCallEvent event = new BluerayCallEvent();
        List<Method> methods = getBluerayMethods(BluerayCallEvent.class);

        for (Method method : methods){
            method.setAccessible(true);
            BluerayField annotation = method.getAnnotation(BluerayField.class);
            int index = headerMapping.get(annotation.name());
            String column = columns[index];

            if(column == null || column.trim().equals("")){
                if(annotation.required()){
                    throw new ParseException(annotation.name() + " field is required", index);
                }
                continue;
            }

            column = column.trim();
            method.invoke(event, column);
        }

        return event;
    }


    private List<Method> getBluerayMethods(Class<BluerayCallEvent> clazz) {
        List<Method> bluerayMethods = new ArrayList<Method>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getAnnotation(BluerayField.class) != null) {
                bluerayMethods.add(method);
                System.out.printf("method %s : added", method.getName());
            }
        }

        return bluerayMethods;
    }

}
