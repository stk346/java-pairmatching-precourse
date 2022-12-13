package pairmatching.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class crewNameReader {

    public crewNameReader() {
    }

    public List<String> readFile(String course) {
        File file = new File("src/main/resources/backend-crew.md");

        if (course.equals("프론트엔드")) {
            file = new File("src/main/resources/frontend-crew.md");
        }
        return read(file);
    }

    private List<String> read(File file) {
        List<String> crewNames = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("해당 과정은 없습니다.");
        }
        while (scanner.hasNextLine()) {
            crewNames.add(scanner.nextLine());
        }
        return crewNames;
    }
}
