package interfaces.interfaceProcessor;

import interfaces.fiflters.*;
import sun.applet.AppletListener;

/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
class FilterAdapter implements Processor {
    Fiflters fiflters;
    public FilterAdapter(Fiflters fiflters){
        this.fiflters = fiflters;
    }
    public String name(){
        return fiflters.showName();
    }
    public WaveForm process(Object object){
        return fiflters.process((WaveForm)object);
    }
}
public class FilterProcessor{
    public static void main(String[] args){
        WaveForm waveForm = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)), waveForm);
        Apply.process(new FilterAdapter(new HighPass(3.4)), waveForm);
        Apply.process(new FilterAdapter(new BandPass(2.4, 5.7)), waveForm);
    }
}
