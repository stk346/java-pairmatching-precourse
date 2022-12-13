package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrewNameReader {

    public CrewNameReader() {
    }

    public List<String> readFileAndShuffle(Course course) {
        File file = new File("src/main/resources/backend-crew.md");

        if (course.equals(Course.FRONTEND)) {
            file = new File("src/main/resources/frontend-crew.md");
        }
        return Randoms.shuffle(read(file));
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
