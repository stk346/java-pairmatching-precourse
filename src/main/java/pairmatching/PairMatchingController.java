package pairmatching;

import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.HashMap;
import java.util.List;
임
public class PairMatchingController {
    /**
     * 레벨 : 미션
     * 각각 레벨과 미션에 대응되는 해시맵을 생성
     */
    HashMap<String, List<List<Crews>>> backEnd = new HashMap<>();
    HashMap<String, List<List<Crews>>> frontEnd = new HashMap<>();
    public void run() {
        boolean continueMatchingFlag = true;
        Level.initMission();
        Levels backEnd = new Levels(Course.BACKEND);
        Levels frondEnd = new Levels(Course.FRONTEND);

        OutputView.showMainDisplay();
        String mainDisplayInput = InputView.showMainDisplayAndGetInput();

        if (mainDisplayInput.equals("1")) {
            OutputView.showPairMatchingDisplay();

            String[] detailsInput = InputView.showSelectDetailsMessageAndGet();
            Crews crews = new Crews();
            if (detailsInput[0].equals(Course.BACKEND.getName())) {
                Level level = Level.getLevel(detailsInput[1]);
                crews.addCrew(detailsInput[0]);
                level.addCrew(detailsInput[0], detailsInput[2], crews);
                backEnd.add(level);
                OutputView.showPairs(level, detailsInput[2]);
            }
        }
    }
}
