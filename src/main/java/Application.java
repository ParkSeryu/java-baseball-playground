import computer.Computer;
import judge.Judge;
import player.Player;

public class Application {
    public static void main(String[] args) {
        Judge judge = new Judge();
        Computer computer = new Computer();
        Player player = new Player();

        judge.gameStart();


    }
}
