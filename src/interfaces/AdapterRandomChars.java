package interfaces;
import java.io.*;
import java.nio.*;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
public class AdapterRandomChars extends RandomChars implements Readable{
    private static int count;
    public AdapterRandomChars(int count){
        this.count = count;
    }

    public int read(CharBuffer cb){
        if(this.count-- == 0){
            return -1;
        }else{
            String result = Character.toString(this.next()) + " ";
            cb.append(result);
            return result.length();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new AdapterRandomChars(10));
        while(scanner.hasNext()){
            System.out.print(scanner.next());
        }
    }
}
