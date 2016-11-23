package interfaces;

/**
 * Created by Anonymous11100001 on 6/6/2016.
 */
interface DaysInWeek{
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3,
        WEDNESDAY = 4, THURSDAY = 5, FRIDAY = 6,
        SATURDAY = 7;
}
class Week implements DaysInWeek{
    private static int count = 0;
    private int id = count++;
    public Week(){
        System.out.println("Week " + this.id);
    }
}
public class Days{
    public static void main(String[] args){
        System.out.println("Sunday = " + DaysInWeek.SUNDAY);
        System.out.println("Monday = " + DaysInWeek.MONDAY);
        Week w0 = new Week();
        Week w1 = new Week();
         // !DaysInWeek.THURSDAY = 12; Final field in interface
        //! w0.TUESDAY = 6;
    }
}
