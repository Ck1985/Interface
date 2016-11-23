package interfaces;
import java.util.*;
import java.nio.*;

/**
 * Created by Anonymous11100001 on 6/5/2016.
 */
public class RandomWords implements Readable{
    private static Random random = new Random();
    private static int count;
    private static final String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowers = "abcdefghijklmnopqrstuwxyz";
    private static final String vowers = "aeiou";

    public RandomWords(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        char[] capitalsChar = capitals.toCharArray();
        char[] lowersChar = lowers.toCharArray();
        char[] vowersChar = vowers.toCharArray();
        if(this.count-- == 0){
            return -1;
        }else{
            cb.append(capitalsChar[random.nextInt(capitalsChar.length)]);
            for(int i = 0; i < 4; i++){
                cb.append(lowersChar[random.nextInt(lowersChar.length)]);
                cb.append(vowersChar[random.nextInt(vowersChar.length)]);
            }
            cb.append(" ");
            return 10;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new RandomWords(10));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
