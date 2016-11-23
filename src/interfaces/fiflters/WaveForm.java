/**
 * Created by Anonymous11100001 on 6/1/2016.
 */
package interfaces.fiflters;

public class WaveForm {
    private static long count;
    private final long id = count++;
    public String toString(){
        return "WaveForm "+ this.id;
    }
}
