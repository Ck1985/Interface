/**
 * Created by Anonymous11100001 on 6/4/2016.
 */
package interfaces.adventure;
import static tk.anonymous11100001.util.Print.*;

interface CanFight{
    void fight();
}
interface CanFly{
    void fly();
}
interface CanSwim{
    void swim();
}
interface CanClimb{
    void climb();
}
class ActionCharacter{
    public void fight(){

    }
}
class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb{
    public void fly(){

    }
    public void swim(){

    }
    public void climb(){

    }
}
public class Adventure {
    public static void t(CanFight canFight){
        canFight.fight();
    }
    public static void k(CanFly canFly){
        canFly.fly();
    }
    public static void m(CanSwim canSwim){
        canSwim.swim();
    }
    public static void c(CanClimb canClimb){

    }
    public static void l(ActionCharacter actionCharacter){
        actionCharacter.fight();
    }
    public static void h(Hero hero){
        hero.fly();
    }
    public static void main(String[] args){
        Hero hero = new Hero();
        t(hero);
        k(hero);
        m(hero);
        l(hero);
        c(hero);
    }
}
