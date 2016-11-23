package interfaces.classprocessor;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/31/2016.
 */
class Processor{
    public String showName(){
        return this.getClass().getSimpleName();
    }
    Object processor(Object object){
        return object;
    }
}
class UpCase extends Processor{
    String processor(Object objectString){
        return ((String)objectString).toUpperCase();
    }
}
class DownCase extends Processor{
    String processor(Object objectString){
        return ((String)objectString).toLowerCase();
    }
}
class Split extends Processor {
    String processor(Object objectString){
        return Arrays.toString(((String)objectString).split(" "));
    }
}
public class Apply {
    public static void processor(Processor processor, Object objectString){
        print("The Processor uses option: " + processor.showName());
        print(processor.processor(objectString));
    }
    public static void main(String[] args){
        Object source = "Cong hoa xa Hoi Chu Nghia Viet Nam";
        processor(new UpCase(), source);
        processor(new DownCase(), source);
        processor(new Split(), source);
    }
}
