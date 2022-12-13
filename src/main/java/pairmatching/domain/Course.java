package pairmatching.domain;

public enum Course {

    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private final String name;

    Course(String name) {
        this.name = name;
    }

    public static Course get(String userInput) {
        for (Course course : values()) {
            if (course.name.equals(userInput)) {
                return course;
            }
        }
        throw new IllegalArgumentException("해당 코스는 없습니다.");
    }
}
