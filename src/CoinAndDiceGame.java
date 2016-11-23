/**
 * Created by Anonymous11100001 on 6/7/2016.
 */
import static tk.anonymous11100001.util.Print.*;
import java.util.*;

interface Game{
    void play();
}
interface GameFactory{
    Game getGame();
}
class Coin implements Game{
    public void play(){
        Random random = new Random();
        int resultTossing = random.nextInt(3);
        print("Tossing the Coin ....");
        switch(resultTossing){
            case 0:
                print("The head");
                return;
            case 1:
                print("The Tail");
                return;
            default:
                print("The edge");
                return;
        }
    }
}
class CoinFactory implements GameFactory{
    public Game getGame(){
        return new Coin();
    }
}
class Dice implements Game{
    public void play(){
        Random random = new Random();
        print("Throwing the Dice ...." + random.nextInt(6) + 1);
    }
}
class DiceFactory implements GameFactory{
    public Game getGame(){
        return new Dice();
    }
}
public class CoinAndDiceGame {
    public static void playGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        game.play();
    }
    public static void main(String[] args){
        playGame(new CoinFactory());
        playGame(new DiceFactory());
    }
}
