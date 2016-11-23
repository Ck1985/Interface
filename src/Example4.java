/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
abstract class Dad{

}
class Son extends Dad{
    public void print(){
        System.out.println("Son of Dad");
    }
}
abstract class SecondDad{
    public abstract void print();
}
class SecondSon extends SecondDad{
    public void print(){
        System.out.println("SecondSon of SecondDad");
    }
}
public class Example4 {
    public static void TestPrintSon(Dad dad){
        ((Son)dad).print();
    }
    public static void TestPrintSecindSon(SecondDad secondDad){
        ((SecondSon)secondDad).print();
    }
    public static void main(String[] args){
        Son son = new Son();
        TestPrintSon(son);
        SecondSon secondSon = new SecondSon();
        TestPrintSecindSon(secondSon);
    }
}
