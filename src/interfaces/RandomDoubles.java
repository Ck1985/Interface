package interfaces;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
public class RandomDoubles {
    private static Random random = new Random();
    public double next(){
        return random.nextDouble();
    }
    public static void main(String[] args){
        RandomDoubles randomDoubles = new RandomDoubles();
        for(int i = 0; i < 7; i++){
            System.out.print(randomDoubles.next() + " ");
        }
    }
}
