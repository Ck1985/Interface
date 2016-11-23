package interfaces.interfaceProcessor;

/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
public class Apply {
    public static void process(Processor processor, Object object){
        System.out.println("Using the processor: " + processor.name());
        System.out.println(processor.process(object));
    }
}
