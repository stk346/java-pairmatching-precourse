package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Pair {

    private String firstCrew;
    private String secondCrew;
    private String thirdCrew;

    public Pair(String firstCrew, String secondCrew) {
        this.firstCrew = firstCrew;
        this.secondCrew = secondCrew;
    }

    public void addPair(String thirdCrew) {
        this.thirdCrew = thirdCrew;
    }

    public List<String> getPair() {
        List<String> pair = new ArrayList<>();
        pair.add(firstCrew);
        pair.add(secondCrew);
        if (thirdCrew != null) {
            pair.add(thirdCrew);
        }
        return pair;
    }
}
