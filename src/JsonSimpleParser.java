import com.fasterxml.jackson.core.JsonParser;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JsonSimpleParser {

    public Object parse() {
        JSONParser parser = new JSONParser();
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
