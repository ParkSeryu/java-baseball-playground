import computer.Computer;
import judge.Judge;
import numberGenerator.NumberGenerator;
import player.Player;

public class Application {
    public static void main(String[] args) {
        Judge judge = new Judge();
        NumberGenerator numberGenerator = new NumberGenerator();
        Computer computer = new Computer(numberGenerator.init());
        Player player = new Player();

        judge.gameStart();


    }
}
