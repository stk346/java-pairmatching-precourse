package pairmatching.controller;

import pairmatching.view.OutputView;

public class PairMatchingController {
    public void run() {
        OutputView.showMainDisPlayMessage();
        String mainDisplayInput = InputView.getMainDisplayInput();

        if (mainDisplayInput.equals("1")) {
            OutputView.showInfo();
            String[] courseLevelMission = InputView.showEnterDetailsMessageAndGet();
        }
    }
}
