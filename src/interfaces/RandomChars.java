package interfaces;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
public class RandomChars {
    private static Random random = new Random();
    public char next(){
        return (char)random.nextInt(128);
    }
    public static void main(String[] args){
        RandomChars randomChars = new RandomChars();
        for(int i = 0; i < 10; i++){
            System.out.println(randomChars.next() + " ");
        }
    }
}
