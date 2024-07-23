import common.Validator;
import computer.Computer;
import judge.Judge;
import numberGenerator.NumberGenerator;
import player.Player;
import ui.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        Validator validator = new Validator();
        NumberGenerator numberGenerator = new NumberGenerator(validator);
        Computer computer = new Computer(numberGenerator.createList());
        Player player = new Player(inputView, validator);
        Judge judge = new Judge(player, computer);


        judge.gameStart();
    }
}
