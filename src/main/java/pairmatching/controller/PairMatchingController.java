package pairmatching.controller;

import pairmatching.domain.*;
import pairmatching.view.OutputView;

public class PairMatchingController {
    public void run() {
        MatchingInfo matchingInfo = new MatchingInfo();

        while (true) {
            OutputView.showMainDisPlayMessage();
            String mainDisplayInput = InputView.getMainDisplayInput();

            matchOrRematchAndShowResult(matchingInfo, mainDisplayInput);

            showExistingPairs(matchingInfo, mainDisplayInput);

            clrearExistingPairs(matchingInfo, mainDisplayInput);

            if (quit(mainDisplayInput)) break;
        }
    }

    private boolean quit(String mainDisplayInput) {
        if (mainDisplayInput.equals("Q")) {
            return true;
        }
        return false;
    }

    private void clrearExistingPairs(MatchingInfo matchingInfo, String mainDisplayInput) {
        if (mainDisplayInput.equals("3")) {
            matchingInfo.clear();
        }
    }

    private void showExistingPairs(MatchingInfo matchingInfo, String mainDisplayInput) {
        if (mainDisplayInput.equals("2")) {
            OutputView.showInfo();
            String[] courseLevelMission = InputView.showEnterDetailsMessageAndGet();
            Course course = Course.get(courseLevelMission[0]);
            Level level = Level.get(courseLevelMission[1]);
            Mission mission = Mission.get(courseLevelMission[2]);
            OutputView.showMatchingResult(matchingInfo.get(course, mission));
        }
    }

    private void matchOrRematchAndShowResult(MatchingInfo matchingInfo, String mainDisplayInput) {
        if (mainDisplayInput.equals("1")) {
            OutputView.showInfo();
            String[] courseLevelMission = InputView.showEnterDetailsMessageAndGet();
            Course course = Course.get(courseLevelMission[0]);
            Level level = Level.get(courseLevelMission[1]);
            Mission mission = Mission.get(courseLevelMission[2]);
            Pairs pairs = new Pairs();
            pairs.getPairs(course);
            if (matchingInfo.isExist(course, mission)) {
                reMatchOrShowExistingPairs(matchingInfo, course, mission, pairs);
            }
            matchingInfo.add(course, mission, pairs);
            OutputView.showMatchingResult(pairs);
        }
    }

    private void reMatchOrShowExistingPairs(MatchingInfo matchingInfo, Course course, Mission mission, Pairs pairs) {
        String isReMatching = InputView.enterRematchingMessageAndGet();
        if (isReMatching.equals("네")) {
            matchingInfo.get(course, mission).clear();
            matchingInfo.add(course, mission, pairs);
        }
        if (isReMatching.equals("아니오")) {
            OutputView.showMatchingResult(pairs);
        }
    }
}
