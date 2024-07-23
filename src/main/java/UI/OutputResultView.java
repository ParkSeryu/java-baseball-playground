package ui;

import java.util.Scanner;

public class OutputResultView {
    private final Scanner scanner = new Scanner(System.in);

    public void tellCount(int strike, int ball) {
        System.out.println(strike + " 스트라이크 " + ball + " 볼 ");
    }

    public void tellGameFinished() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public int tellGameRestarted() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        return scanner.nextInt();
    }


}
