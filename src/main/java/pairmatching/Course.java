package pairmatching;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public String getName() {
        return name;
    }

    public static Course getCourse(String input) {
        for (Course course : values()) {
            if (course.getName() == input) {
                return course;
            }
        }
        throw new IllegalArgumentException("[ERROR] 존재하지 않는 과정입니다.");
    }

    public int getSize() {
        return Course.values().length;
    }
}
