package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.PatternSyntaxException;

public class InputView {
    public static String showMainDisplayAndGetInput() {
        String userInput = Console.readLine();
        try {
            if (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && !userInput.equals("Q")) {
                throw new IllegalArgumentException("[ERROR] 올바른 형식을 입력해주세요.");
            }
            return userInput;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return showMainDisplayAndGetInput();
        }
    }

    public static String[] showSelectDetailsMessageAndGet() {
        System.out.println("과정, 레벨, 미션을 선택하세요.");
        String userInput = Console.readLine();
        try {
            return userInput.split(", ");
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("[ERROR] 구분은 쉼표(,) + 스페이스( )로 해주세요.");
        }
    }
}
