package pairmatching.domain;

public enum Level {

    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private final String level;

    Level(String level) {
        this.level = level;
    }

    public static Level get(String s) {
        for (Level level : values()) {
            if (level.level.equals(s)) {
                return level;
            }
        }
        throw new IllegalArgumentException("해당 레벨은 없습니다.");
    }
}
