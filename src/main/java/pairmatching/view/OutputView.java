package pairmatching.view;

public class OutputView {
    public static void showMainDisPlayMessage() {
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료.");
    }

    public static void showInfo() {
        System.out.println("#############################################");
        System.out.println("과정: 백엔드 | 프론트엔드");
        System.out.println("미션:");
        System.out.println("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임 \n" +
                            "  - 레벨2: 장바구니 | 결제 | 지하철노선도 \n" +
                            "  - 레벨3:  \n" +
                            "  - 레벨4: 성능개선 | 배포 \n" +
                            "  - 레벨5: ");
        System.out.println("#############################################");
    }
}
