package interfaces.fiflters;

/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
public class BandPass extends Fiflters{
    double lowCutOff, highCutOff;
    public BandPass(double lowCutOff, double highCutOff){
        this.lowCutOff = lowCutOff;
        this.highCutOff = highCutOff;
    }
    public WaveForm process(WaveForm waveForm){
        return waveForm;
    }
}
