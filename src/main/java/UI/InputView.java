package ui;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public static final String msg = "숫자를 입력 해 주세요 :";

    public void printPromptMsg() {
        System.out.println(msg);
    }

    public int getScannerNumber(){
        return scanner.nextInt();
    }

}
