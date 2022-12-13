package pairmatching;

import pairmatching.domain.Crews;
import pairmatching.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        Crews crews = Crews.init();
        crews.addBackEndCrews(InputView.inputBackEndCrews());
    }
}
