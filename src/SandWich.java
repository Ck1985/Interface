/**
 * Created by Anonymous11100001 on 5/30/2016.
 */
import static tk.anonymous11100001.util.Print.*;

interface FastFood{
    void cheeseBurger();
    void fires();
    void softDrink();
}
class Bread{
    Bread(){
        print("Bread()");
    }
}
class Cheese{
    Cheese(){
        print("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        print("Lettuce");
    }
}
class Pickle{
    Pickle(){
        print("Pickle()");
    }
}
class Meal{
    Meal(){
        print("Meal()");
    }
}
class Lunch extends Meal{
    Lunch(){
        print("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        print("PortableLunch()");
    }
}
public class SandWich extends PortableLunch implements FastFood{
    public void cheeseBurger(){
        print(" SandWich cheeseBurger");
    }
    public void fires(){
        print("Sandwich fires");
    }
    public void softDrink(){
        print("SandWich softDrink");
    }
    public static void main(String[] args){
        SandWich sandWich = new SandWich();
        sandWich.cheeseBurger();
        sandWich.fires();
        sandWich.softDrink();
    }
}
