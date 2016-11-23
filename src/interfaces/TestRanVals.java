package interfaces;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
interface RanVals{
    Random random = new Random();
    int ranInt = random.nextInt()*10;
    long ranLong = random.nextLong()*10;
    double ranDouble = random.nextDouble()*10;
    float ranFloat = random.nextFloat()*10;
}
public class TestRanVals {
    public static void main(String[] args){
        System.out.println(RanVals.ranInt);
        //.......
    }
}
