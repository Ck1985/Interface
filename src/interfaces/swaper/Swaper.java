/**
 * Created by Anonymous11100001 on 6/2/2016.
 */
package interfaces.swaper;

import java.util.Arrays;

public class Swaper {
    public String name(){
        return this.getClass().getSimpleName();
    }
    void swap(char[] arr, int m, int n){
        char temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    public String process(Object object){
        char[] arrChar = ((String)object).toCharArray();
        for(int i = 0; i < arrChar.length - 1; i = i + 2){
            swap(arrChar, i, i + 1);
        }
        return Arrays.toString(arrChar);
    }
}
