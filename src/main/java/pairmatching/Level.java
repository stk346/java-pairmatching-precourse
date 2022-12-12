package pairmatching;

import java.util.*;

public enum Level {
    LEVEL1("레벨1", new HashMap<String, Crews>()),
    LEVEL2("레벨2", new HashMap<String, Crews>()),
    LEVEL3("레벨3", new HashMap<String, Crews>()),
    LEVEL4("레벨4", new HashMap<String, Crews>()),
    LEVEL5("레벨5", new HashMap<String, Crews>());

    private String name;
    private HashMap<String, Crews> map;
    private List<String> missions = new ArrayList<>();

    Level(String name, HashMap<String, Crews> map) {
        this.name = name;
        this.map = map;
    }
    // 추가 기능 구현

    public static void initMission() {
        LEVEL1.map.put("자동차경주", null);
        LEVEL1.map.put("로또", null);
        LEVEL1.map.put("숫자야구게임", null);

        LEVEL2.map.put("장바구니", null);
        LEVEL2.map.put("결제", null);
        LEVEL2.map.put("지하철노선도", null);

        LEVEL4.map.put("성능개선", null);
        LEVEL4.map.put("배포", null);
    }

    public static void addCrew(String level, String mission, Crews crews) {
        if (level.equals("레벨1")) {
            LEVEL1.map.put(mission, crews);
        }
        if (level.equals("레벨2")) {
            LEVEL2.map.put(mission, crews);
        }
        if (level.equals("레벨3")) {
            LEVEL3.map.put(mission, crews);
        }
        if (level.equals("레벨4")) {
            LEVEL4.map.put(mission, crews);
        }
        if (level.equals("레벨5")) {
            LEVEL5.map.put(mission, crews);
        }
    }

    public static Level getLevel(String input) {
        for (Level level : values()) {
            if (level.getName().equals(input)) {
                return level;
            }
        }
        throw new IllegalArgumentException("[ERROR] 올바른 레벨을 입력해주세요.");
    }

    public static void putCrewsToMission(String inputLevel, String mission, Crews crews) {
        for (Level level : values()) {
            if (level.getName().equals(inputLevel)) {
                level.map.put(mission, crews);
            }
        }
    }

    public static Crews getCrewsOfMission(String inputLevel, String mission) {
        for (Level level : values()) {
            if (level.getName().equals(inputLevel)) {
                return level.map.get(mission);
            }
        }
        throw new IllegalArgumentException("[ERROR] 올바른 정보를 입력해주세요.");
    }

    public String getName() {
        return name;
    }

    public Object[] getMissions() {
        return map.keySet().toArray();
    }
}
