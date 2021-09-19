import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ConverterImpl converter = new ConverterImpl();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Unit: ");
        converter.setUnit(scanner.nextLine());
        System.out.println("Value: ");
        converter.setValue(scanner1.nextDouble());
        System.out.println("Convert to: ");
        converter.setConvert_to(scanner2.nextLine());

        scanner.close();
        scanner1.close();
        scanner2.close();

        Map<String, Double> map = new HashMap<>();
        map.put(converter.getUnit(), converter.getValue());
        converter.setMap(map);
        String result = mapper.writeValueAsString(converter);

        if (map.containsKey("m") && converter.getConvert_to().equals("cm")) {
            System.out.print("Result = " + Converter.mToCm(converter.getValue()));

        } else if (map.containsKey("m") && converter.getConvert_to().equals("in")) {
            System.out.print("Result = " + Converter.mToIn(converter.getValue()));

        } else if (map.containsKey("m") && converter.getConvert_to().equals("ft")) {
            System.out.print("Result = " + Converter.mToFt(converter.getValue()));

        } else if (map.containsKey("cm") && converter.getConvert_to().equals("m")) {
            System.out.print("Result = " + Converter.cmToM(converter.getValue()));

        } else if (map.containsKey("cm") && converter.getConvert_to().equals("in")) {
            System.out.print("Result = " + Converter.cmToIn(converter.getValue()));

        } else if (map.containsKey("cm") && converter.getConvert_to().equals("ft")) {
            System.out.print("Result = " + Converter.cmToFt(converter.getValue()));

        } else if (map.containsKey("in") && converter.getConvert_to().equals("cm")) {
            System.out.print("Result = " + Converter.inToCm(converter.getValue()));

        } else if (map.containsKey("in") && converter.getConvert_to().equals("m")) {
            System.out.print("Result = " + Converter.inToM(converter.getValue()));

        } else if (map.containsKey("in") && converter.getConvert_to().equals("ft")) {
            System.out.print("Result = " + Converter.inToFt(converter.getValue()));

        } else if (map.containsKey("ft") && converter.getConvert_to().equals("cm")) {
            System.out.print("Result = " + Converter.ftToCm(converter.getValue()));

        } else if (map.containsKey("ft") && converter.getConvert_to().equals("m")) {
            System.out.print("Result = " + Converter.ftToM(converter.getValue()));

        } else if (map.containsKey("ft") && converter.getConvert_to().equals("in")) {
            System.out.print("Result = " + Converter.ftToIn(converter.getValue()));

        } else {
            System.out.print("Wrong values! Please type correct values.");
        }
    }
}
