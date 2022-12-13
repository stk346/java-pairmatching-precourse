package pairmatching.domain;

public enum Mission {

    RACING_CAR(Level.LEVEL1, "자동차경주"),
    LOTTO(Level.LEVEL1, "자동차경주"),
    BASEBALL(Level.LEVEL1, "자동차경주"),

    CART(Level.LEVEL2, "장바구니"),
    PAYMENT(Level.LEVEL2, "결제"),
    SUBWAY_MAP(Level.LEVEL2, "지하철노선도"),

    PERFORMANCE_IMPROVEMENT(Level.LEVEL4, "성능개선"),
    DISTRIBUTE(Level.LEVEL4, "배포");

    private final Level level;
    private final String mission;

    Mission(Level level, String mission) {
        this.level = level;
        this.mission = mission;
    }
}
