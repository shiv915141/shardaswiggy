//comit 2

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class dish {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello, world!");

        BufferedReader restroReader = Files.newBufferedReader(
                Paths.get("C:\\Users\\shiv kumar Dubey\\IdeaProjects\\shardaswiggy\\shardaswiggy\\data\\dish.csv"),
                StandardCharsets.UTF_8
        );

        String line;
        while ((line = restroReader.readLine()) != null) {
            String[] partsOfLine = line.split(",");
            for (String part : partsOfLine) {
                System.out.println(part);
            }
        }

        restroReader.close();
    }
}
