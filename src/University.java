/**
 * Created by Anonymous11100001 on 6/4/2016.
 */
interface Teach{
    void teach();
}
interface TeachMathematic extends Teach{
    void teachMath();
}
interface TeachHistory extends Teach{
    void teachHis();
}
interface TeachCollection extends TeachMathematic, TeachHistory{
    void teachCollection();
}
class Teacher implements TeachCollection{
    public void teachCollection(){

    }
    public void teachMath(){

    }
    public void teachHis(){

    }
    public void teach(){

    }
}
public class University {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        ((TeachCollection)teacher).teachCollection();
        ((TeachMathematic)teacher).teachMath();
        ((Teach)teacher).teach();
        ((TeachHistory)teacher).teach();
    }

}
