package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Pairs {

    private List<Pair> pairs = new ArrayList<>();
    private Course course;

    public void getPairs(Course course) {
        this.course = course;
        CrewNameReader crewNameReader = new CrewNameReader();
        List<String> crewNames = crewNameReader.readFileAndShuffle(course);
        addWhenSizeIsEven(crewNames);
        addWhenSizeIsOdd(crewNames);
    }

    private void addWhenSizeIsOdd(List<String> crewNames) {
        if (crewNames.size() % 2 != 0) {
            int i=0;
            for (; i < crewNames.size() - 1; i += 2) {
                pairs.add(new Pair(crewNames.get(i), crewNames.get(i + 1)));
            }
            pairs.get(i / 2 - 1).addPair(crewNames.get(i));
        }
    }

    private void addWhenSizeIsEven(List<String> crewNames) {
        if (crewNames.size() % 2 == 0) {
            for (int i = 0; i < crewNames.size(); i += 2) {
                pairs.add(new Pair(crewNames.get(i), crewNames.get(i + 1)));
            }
        }
    }

    public void clear() {
        pairs.clear();
    }

    public List<Pair> getPairs() {
        return pairs;
    }
}
