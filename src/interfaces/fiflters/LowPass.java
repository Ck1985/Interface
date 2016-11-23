package interfaces.fiflters;

/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
public class LowPass extends Fiflters {
    double cutOff;
    public LowPass(double cutOff){
        this.cutOff = cutOff;
    }
    public WaveForm process(WaveForm waveForm){
        return waveForm;
    }
}
