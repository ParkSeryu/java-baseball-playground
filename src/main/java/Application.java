import common.Validator;
import computer.Computer;
import judge.Judge;
import numberGenerator.NumberGenerator;
import player.Player;
import ui.InputView;
import ui.OutputResultView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputResultView outputResultView = new OutputResultView();
        Validator validator = new Validator();
        start(inputView, outputResultView, validator);
    }

    public static void start(InputView inputView, OutputResultView outputResultView, Validator validator) {
        NumberGenerator numberGenerator = new NumberGenerator(validator);
        Judge judge = new Judge(outputResultView);
        Computer computer = new Computer(numberGenerator.createList());
        System.out.println(computer.getNumberList());
        Player player = new Player(inputView, validator);
        while (judge.getStrike() != 3) {
            player.createPlayerList();
            judge.judgeStart(player.getNumberList(), computer.getNumberList());
        }
        outputResultView.tellGameFinished();
        int i = outputResultView.tellGameRestarted();
        if (i == 1) {
            start(inputView, outputResultView, validator);
        }
    }
}
