/**
 * Created by Anonymous11100001 on 6/4/2016.
 */
interface Fight{
    void hit();
    void kick();
}
interface Eat{
    void eatMeat();
    void eatLeaf();
}
interface Move{
    void run();
    void ride();
}
interface Active extends Fight, Eat, Move{
    void learn();
}
abstract class Animal{
    private int i = 0;
    public abstract void sleep();
}
class Monkey extends Animal implements Active{
    private int j = 0;
    public void hit(){}
    public void kick(){}
    public void eatMeat(){}
    public void eatLeaf(){}
    public void run(){}
    public void ride(){}
    public void learn(){}
    public void sleep(){}
}
public class Circus {
    public static void f(Fight fight){
        fight.hit();
    }
    public static void g(Eat eat){
        eat.eatLeaf();
    }
    public static void k(Move move){
        move.ride();
    }
    public static void l(Active active){
        active.learn();
    }
    public static void main(String[] args){
        Monkey monkey = new Monkey();
        monkey.eatLeaf();
        monkey.hit();
        monkey.run();
        //.......
        f(monkey);
        g(monkey);
        k(monkey);
        l(monkey);
    }
}
