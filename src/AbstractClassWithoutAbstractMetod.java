/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
import static tk.anonymous11100001.util.Print.*;
abstract class A{
    public void f(){

    }
    public void g(){

    }
}
abstract class B{
    public abstract void f();
}
abstract class C{

}
class C1 extends C{
    public void show(){
        print("C1.show()");
    }
}
class AbstractClassWithoutAbstractMetod {
    public static void main(String[] args){
       //! A a = new A();
        //! B b = new B();
    }
}
