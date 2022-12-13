package pairmatching.domain;

import java.util.HashMap;
import java.util.Map;

public class MatchingInfo {

    private Map<Mission, Pairs> backMatchingInfo = new HashMap<>();
    private Map<Mission, Pairs> frontMatchingInfo = new HashMap<>();

    public void add(Course course, Mission mission, Pairs pairs) {
        if (course == Course.BACKEND) {
            backMatchingInfo.put(mission, pairs);
            return;
        }
        frontMatchingInfo.put(mission, pairs);
    }

    public Pairs get(Course course, Mission mission) {
        if (course == Course.BACKEND) {
            return backMatchingInfo.get(mission);
        }
        return frontMatchingInfo.get(mission);
    }

    public void ifOverlapPairsRematch(Course course, Level level, Mission mission, Pairs pairs) {
        if (course == Course.BACKEND) {
            for (Mission mission1 : backMatchingInfo.keySet()) {
                Pairs forVerifyPairs = backMatchingInfo.get(mission1);

            }
        }

        try {
            add(course, mission, pairs);

        }
    }

    public boolean isExist(Course course, Mission mission) {
        if (course == Course.BACKEND) {
            return backMatchingInfo.get(mission) != null;
        }
        return frontMatchingInfo.get(mission) != null;
    }



    public void clear(Course course, Mission mission) {
        get(course, mission).clear();
    }

    public void clear() {
        backMatchingInfo.clear();
        frontMatchingInfo.clear();
    }
}
