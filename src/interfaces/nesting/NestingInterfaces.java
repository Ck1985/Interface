/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
package interfaces.nesting;

class A{
    interface B{
        void f();
    }
    public class BImp implements B{
        public void f(){}
    }
    private class BImp2 implements B{
        public void f(){}
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        public void f(){}
    }
    private class CImp2 implements C{
        public void f(){}
    }
    private interface D{
        void f();
    }
    private class DImp implements D{
        public void f(){}
    }
    public class DImp2 implements D{
        public void f(){}
    }
    public D getD(){return new DImp2();}
    private D dRef;
    public void receiveD(D d){
        this.dRef = d;
        d.f();
    }
}
interface E{
    interface G{
        void f();
    }
    // "public" is redundant
    public interface H{
        void f();
    }
    void g();
     // Can not there is "private in interface
    /*private interface I{

    }*/
}
public class NestingInterfaces {
    public class BImp implements A.B{
        public void f(){}
    }
    class CImp implements A.C{
        public void f(){}
    }
    //!class DImp implements A.D Can not implemts private interface
    //except within that definition interface class
    class EImp implements E{
        public void g(){}
    }
    class EGImp implements E.G{
        public void f(){}
    }
    class EImp2 implements E{
        public void g(){}
        class EG implements E.G{
            public void f(){}
        }
    }
    public static void main(String[] args){
        A a = new A();
        // Can not access A..
        // A.D ad = a.getD();
        //A.DImp2 adimp2 = a.getD();
        //a.getD().f();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}

