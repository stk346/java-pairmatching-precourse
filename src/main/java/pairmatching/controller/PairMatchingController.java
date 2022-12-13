package pairmatching.controller;

import pairmatching.domain.*;
import pairmatching.view.OutputView;

public class PairMatchingController {
    public void run() {
        MatchingInfo matchingInfo = new MatchingInfo();

        OutputView.showMainDisPlayMessage();
        String mainDisplayInput = InputView.getMainDisplayInput();

        if (mainDisplayInput.equals("1")) {
            OutputView.showInfo();
            String[] courseLevelMission = InputView.showEnterDetailsMessageAndGet();
            Course course = Course.get(courseLevelMission[0]);
            Level level = Level.get(courseLevelMission[1]);
            Mission mission = Mission.get(courseLevelMission[2]);
            Pairs pairs = new Pairs();
            pairs.getPairs(course);
            matchingInfo.add(mission, pairs);
            OutputView.showMatchingResult(pairs);
        }
    }
}
