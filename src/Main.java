import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Reader reader = new FileReader(args[0]);
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(reader);
        JSONObject distanceObject = (JSONObject) jsonObject.get("distance");
        String unit = (String) distanceObject.get("unit");
        double value = (double) distanceObject.get("value");
        String convert_to = (String) jsonObject.get("convert_to");

        System.out.println("Converting " + value + " from " + unit.toUpperCase(Locale.ROOT) + " to " + convert_to.toUpperCase(Locale.ROOT) + "...");

        if (unit.equals("cm") && convert_to.equals("m")) {
            Converter.cmToM(value);
        } else if(unit.equals("cm") && convert_to.equals("in")) {
            Converter.cmToIn(value);
        } else if(unit.equals("cm") && convert_to.equals("ft")) {
            Converter.cmToFt(value);
        } else if(unit.equals("m") && convert_to.equals("cm")) {
            Converter.mToCm(value);
        } else if(unit.equals("m") && convert_to.equals("in")) {
            Converter.mToIn(value);
        } else if(unit.equals("m") && convert_to.equals("ft")) {
            Converter.mToFt(value);
        } else if(unit.equals("in") && convert_to.equals("cm")) {
            Converter.inToCm(value);
        } else if(unit.equals("in") && convert_to.equals("m")) {
            Converter.inToM(value);
        } else if(unit.equals("in") && convert_to.equals("ft")) {
            Converter.inToFt(value);
        } else if(unit.equals("ft") && convert_to.equals("cm")) {
            Converter.ftToCm(value);
        } else if(unit.equals("ft") && convert_to.equals("m")) {
            Converter.ftToM(value);
        } else if(unit.equals("ft") && convert_to.equals("in")) {
            Converter.ftToIn(value);
        }
    }
}
