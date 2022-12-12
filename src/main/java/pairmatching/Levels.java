package pairmatching;

import java.util.ArrayList;
import java.util.List;

public class Levels {

    private Course course;
    private List<Level> levels = new ArrayList<>();

    public Levels(Course course) {
        this.course = course;
    }

    public Level getLevel(String input) {
        return getLevel(input);
    }

    public void add(Level level) {
        levels.add(level);
    }

}
