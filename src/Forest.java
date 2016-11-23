/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
import static tk.anonymous11100001.util.Print.*;
abstract class Trees{
    public abstract String print();
    public Trees(){
        System.out.println("Tree constructor");
        print();
    }
}
class LemonTree extends Trees{
    private int id = 1;
    public String print(){
        return "Lemon Tree" + this.id;
    }
}
class OrangeTree extends Trees{
    private int id = 2;
    public String print(){
        return "Orange Tree" + this.id;
    }
}
class BananaTree extends Trees{
    private int id = 3;
    public String print(){
        return "Banana Tree" + this.id;
    }
}
public class Forest {
    public static void main(String[] args){
        LemonTree lt = new LemonTree();
        System.out.println(lt.print());
    }
}
