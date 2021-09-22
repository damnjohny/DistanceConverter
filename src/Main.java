import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        Scanner choiceScanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(System.in);
        System.out.println("Enter '1' to write full path of ur file OR '2' to read path from main arguments");
        Reader reader = null;
        int choice = choiceScanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter full path of ur file with JSON data");
            reader = new FileReader(fileScanner.nextLine());
        } else if(choice == 2) {
            System.out.println("Reading JSON data from " + args[0]);
            reader = new FileReader(args[0]);
        }

        JSONObject jsonObject = (JSONObject) new JSONParser().parse(reader);
        JSONObject distanceObject = (JSONObject) jsonObject.get("distance");
        String unit = (String) distanceObject.get("unit");
        double value = (double) distanceObject.get("value");
        String convert_to = (String) jsonObject.get("convert_to");

        System.out.println("Converting " + value + " from " + unit.toUpperCase(Locale.ROOT) + " to " + convert_to.toUpperCase(Locale.ROOT) + "...");

        if (unit.equals("cm") && convert_to.equals("m")) {
            Converter.cmToM(value);
        } else if(unit.equals("cm") && convert_to.equals("inch")) {
            Converter.cmToInch(value);
        } else if(unit.equals("cm") && convert_to.equals("ft")) {
            Converter.cmToFt(value);
        } else if(unit.equals("m") && convert_to.equals("cm")) {
            Converter.mToCm(value);
        } else if(unit.equals("m") && convert_to.equals("inch")) {
            Converter.mToInch(value);
        } else if(unit.equals("m") && convert_to.equals("ft")) {
            Converter.mToFt(value);
        } else if(unit.equals("inch") && convert_to.equals("cm")) {
            Converter.inchToCm(value);
        } else if(unit.equals("inch") && convert_to.equals("m")) {
            Converter.inchToM(value);
        } else if(unit.equals("inch") && convert_to.equals("ft")) {
            Converter.inchToFt(value);
        } else if(unit.equals("ft") && convert_to.equals("cm")) {
            Converter.ftToCm(value);
        } else if(unit.equals("ft") && convert_to.equals("m")) {
            Converter.ftToM(value);
        } else if(unit.equals("ft") && convert_to.equals("inch")) {
            Converter.ftToInch(value);
        }
    }
}
