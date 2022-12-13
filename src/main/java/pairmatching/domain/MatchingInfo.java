package pairmatching.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingInfo {

    private Map<Mission, Pairs> matchingInfo = new HashMap<>();

    public void add(Mission mission, Pairs pairs) {
        matchingInfo.put(mission, pairs);
    }

    public Pairs get(Mission mission) {
        return matchingInfo.get(mission);
    }
}
