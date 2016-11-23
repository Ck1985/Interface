package interfaces.swaper;
import interfaces.interfaceProcessor.*;

/**
 * Created by Anonymous11100001 on 6/3/2016.
 */
class AdaptSwaper implements Processor{
    Swaper swaper;
    public String name(){
        return swaper.name();
    }
    public AdaptSwaper(Swaper swaper){
        this.swaper = swaper;
    }
    public String process(Object object){
        return swaper.process(object);
    }
}
public class SwaperProcessor{
    public static void main(String[] args){
        String source = "Cao Xuan Quy";
        Apply.process(new AdaptSwaper(new Swaper()), source);
    }
}
