/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
import static tk.anonymous11100001.util.Print.*;
import interfaces.Engine;

class EngineFire implements Engine{
    public void speed(){
        print("200.000 km/s");
    }
    public void proviceEngine(){
        print("50.000 N");
    }
}
class EngineWater implements Engine{
    public void speed(){
        print("40.0000 km/s");
    }
    public void proviceEngine(){
        print("20.000 N");
    }
}
public class Factory {
}
