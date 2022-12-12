package pairmatching;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PairMatcher {

    public List<String> getShuffledList(String course) {
        return shuffle(readCrew(course));
    }

    private List<String> readCrew(String course) {
        List<String> crewList = new ArrayList<>();
        if (course.equals(Course.BACKEND.getName())) {
            crewList = getCrewNames("/Users/lullaby/Desktop/Bucket/woowacource_final_test_preparing/java-pairmatching-precourse/src/main/resources/backend-crew.md");
        }
        if (course.equals(Course.FRONTEND.getName())) {
            crewList = getCrewNames("/Users/lullaby/Desktop/Bucket/woowacource_final_test_preparing/java-pairmatching-precourse/src/main/resources/frontend-crew.md");
        }
        return crewList;
    }

    private List<String> getCrewNames(String fileName) {
        List<String> nameList = new ArrayList<>();
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(fileName));
            while (true) {
                String frontEnd = br1.readLine();
                nameList.add(frontEnd);
                if (frontEnd == null) break;
            }
            return nameList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> shuffle(List<String> nameList) {
        List<String> shuffledCrew = Randoms.shuffle(nameList);
        return shuffledCrew;
    }
}
