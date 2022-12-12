package pairmatching;

import java.util.ArrayList;
import java.util.List;

public class Crews {
    private List<Crew> crews;

    public void addCrew(String course) {
        PairMatcher pairMatcher = new PairMatcher();
        List<String> crewNames = pairMatcher.getShuffledList(course);
        for (String name : crewNames) {
            crews.add(new Crew(Course.getCourse(course), course));
        }
    }

    public List<Crew> getCrews() {
        return crews;
    }
}
