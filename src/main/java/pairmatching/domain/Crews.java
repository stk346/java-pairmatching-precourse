package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Crews {

    private final List<Crew> crews;

    public Crews(List<Crew> crews) {
        this.crews = crews;
    }
    public static Crews init() {
        return new Crews(new ArrayList<>());
    }

    public void addBackEndCrews(List<String> inputBackEndCrews) {

    }
}
