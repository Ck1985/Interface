/**
 * Created by Anonymous11100001 on 5/28/2016.
 */
import static tk.anonymous11100001.util.Print.*;

abstract class Rodent{
    public abstract void eat(Foods foods);
    public abstract void leave();
    public String showName(){
        return "Rodent";
    }
}
class Gerbil extends Rodent{
    public void eat(Foods foods){
        print("Gerbil eat "+ foods);
    }
    public void leave(){
        print("Gerbil leave in forest");
    }
    public String showName(){
        return "Gerbil";
    }
}
class Mouse extends Rodent{
    public void eat(Foods foods){
        print("Mouse eats " + foods);
    }
    public void leave(){
        print("Mouse leave in home human");
    }
    public String showName(){
        return "Mouse";
    }
}
class Hamster extends Rodent{
    public void eat(Foods food){
        print("Hamster eats " + food);
    }
    public void leave(){
        print("Hamster leave in home human");
    }
    public String showName(){
        return "Hamster";
    }
}
public class StoreRodent {
    public static void getTheFood(Rodent rodent){
        rodent.eat(Foods.DIRTY_FOOD);
    }
    public static void getAllFood(Rodent[] rodents){
        for(Rodent r : rodents){
            getTheFood(r);
        }
    }
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[]{
                new Gerbil(),
                new Mouse(),
                new Hamster()
        };
        getAllFood(rodents);
    }
}
