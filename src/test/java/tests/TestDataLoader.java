package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestDataLoader {
    public static String loadTestData(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
