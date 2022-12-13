package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getMainDisplayInput() {
        String input = Console.readLine();
        if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("Q")) {
            throw new IllegalArgumentException("[ERROR] 올바른 형식으로 입력해주세요.");
        }
        return input;
    }

    public static String[] showEnterDetailsMessageAndGet() {
        System.out.println("과정, 레벨, 미션을 선택하세요.\n" +
                            "ex) 백엔드, 레벨1, 자동차경주");
        String input = Console.readLine();
        return input.replace(" ", "").split(",");

    }

    public static String enterRematchingMessageAndGet() {
        System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?");
        System.out.println("네 | 아니오");
        String input = Console.readLine();
        if (!input.equals("네") && !input.equals("아니오")) {
            throw new IllegalArgumentException("네, 아니오만 입력할 수 있습니다.");
        }
        return input;
    }
}
