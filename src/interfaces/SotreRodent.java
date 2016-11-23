package interfaces;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/30/2016.
 */
interface Rodent{
    void eat();
    void leave();
}
class Gerbil implements Rodent{
    public void eat(){
        print("Gerbil eat rice");
    }
    public void leave(){
        print("Gerbil leave in forest");
    }
}
class Mouse implements Rodent{
    public void eat(){
        print("Mouse eats durty");
    }
    public void leave(){
        print("Mouse leaves in house");
    }
}
class Hamster implements Rodent{
    public void eat(){
        print("Hamster eats rice");
    }
    public void leave(){
        print("Hamster leaves in House");
    }
}
public class SotreRodent {
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[]{
                new Gerbil(),
                new Mouse(),
                new Hamster()
        };
        for(Rodent r : rodents){
            r.eat();
        }
    }
}
