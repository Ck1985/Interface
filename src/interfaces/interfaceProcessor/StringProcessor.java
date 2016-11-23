package interfaces.interfaceProcessor;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
public abstract class StringProcessor implements Processor {
    public String name(){
        return this.getClass().getSimpleName();
    }
    public abstract String process(Object object);
    public static String s = "Cong Hoa Xa Hoi Chu Nghia Viet Nam";
    public static void main(String[] args){
        Apply.process(new Upcase(), s);
        Apply.process(new LowerCase(), s);
        Apply.process(new Split(), s);
    }
}
class Upcase extends StringProcessor{
    public String process(Object object){
        return ((String)object).toUpperCase();
    }
}
class LowerCase extends StringProcessor{
    public String process(Object object){
        return ((String)object).toLowerCase();
    }
}
class Split extends StringProcessor{
    public String process(Object object){
        return Arrays.toString(((String)object).split(" "));
    }
}
