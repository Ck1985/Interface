package polymorphism;
import interfaces.Engine;

/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
public class EngineHorse implements Engine {
    public void speed(){
        System.out.print("10 km/h");
    }
    public void proviceEngine(){
        System.out.print("5 N");
    }
}
