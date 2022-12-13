package pairmatching.controller;

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
}
