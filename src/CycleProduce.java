/**
 * Created by Anonymous11100001 on 6/7/2016.
 */
import static tk.anonymous11100001.util.Print.*;

interface Cycle{
    void produce();
    void ride();
}
interface CycleFactory{
    Cycle produceCycle();
}
class Unicycle implements Cycle{
    public void produce(){
        print("Producing the Unicycle ......");
    }
    public void ride(){
        print("The people is riding Unicycle ....");
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle produceCycle(){
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    public void produce(){
        print("Producing the Bicycle .....");
    }
    public void ride(){
        print("The people is riding the Bicycle ...");
    }
}
class BicycleFactory implements CycleFactory{
    public Cycle produceCycle(){
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    public void produce(){
        print("Producing the TriCycle .....");
    }
    public void ride(){
        print("The people is riding the Tricycle ....");
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle produceCycle(){
        return new Tricycle();
    }
}
public class CycleProduce {
    public static void production(CycleFactory cycleFactory){
        Cycle c = cycleFactory.produceCycle();
        c.ride();
        c.produce();
    }
    public static void main(String[] args){
        production(new UnicycleFactory());
        production(new BicycleFactory());
        production(new TricycleFactory());
    }
}
