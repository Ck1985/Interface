package interfaces.fiflters;

/**
 * Created by Anonymous11100001 on 6/1/2016.
 */
public class Fiflters {
    public String showName(){
        return this.getClass().getSimpleName();
    }
    public WaveForm process(WaveForm waveForm){
        return waveForm;
    }
}

/*public interface Fiflters{
    String name();
    WaveForm process(WaveForm waveForm);
}*/
