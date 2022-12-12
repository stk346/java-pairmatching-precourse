package pairmatching.view;

import pairmatching.Course;
import pairmatching.Level;
import pairmatching.Levels;

public class OutputView {
    public static void showMainDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("기능을 선택하세요. \n");
        sb.append("1. 페어매칭 \n2. 페어 조회 \n3. 페어 초기화 \nQ. 종료");
        System.out.println(sb);
    }

    public static void showPairMatchingDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("#############################################\n");
        sb.append("과정: ");
        showCourse(sb);

        sb.append("미션:\n");

        Level[] levels = Level.values();
        for (Level level : levels) {
            sb.append("  - " + level.getName() + ": ");
            showMissionsAndLevel(sb, level);
        }
        sb.append("#############################################\n");
        System.out.println(sb);
    }

    private static void showCourse(StringBuilder sb) {
        Course[] courses = Course.values();
        int courseCount = 1;
        for (Course course : courses) {
            if (courseCount >= courses.length) {
                sb.append(course.getName() + "\n");
                continue;
            }
            sb.append(course.getName() + " | ");
            courseCount++;
        }
    }

    private static void showMissionsAndLevel(StringBuilder sb, Level level) {
        int missionCount = 1;
        int missionLength = level.getMissions().length;
        if (missionLength == 0) {
            sb.append("\n");
            return;
        }
        for (Object missionName : level.getMissions()) {
            if (missionCount >= missionLength) {
                sb.append(missionName + "\n");
                continue;
            }
            sb.append(missionName + " | ");
            missionCount++;
        }
    }

    public static void showPairs(Level level, String mission) {
        level.getCrewsOfMission()
    }
}
