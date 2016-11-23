/**
 * Created by Anonymous11100001 on 5/28/2016.
 */
package interfaces;
import static tk.anonymous11100001.util.Print.*;
import polymorphism.Notes;

abstract class Instruments{
    public abstract void play(Notes notes);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}
class Wind extends Instruments{
    public void play(Notes notes){
        print("Wind.play() " + notes);
    }
    public String what(){
        return "Wind";
    }
    public void adjust(){

    }
}
class Percussion extends Instruments{
    public void play(Notes notes){
        print("Percussion.play()");
    }
    public String what(){
        return "Percussion";
    }
    public void adjust(){

    }
}
class Stringed extends Instruments{
    public void play(Notes notes){
        print("Stringed.play() " + notes);
    }
    public String what(){
        return "Stringed";
    }
    public void adjust(){

    }
}
class WoodWind extends Wind{
    public void play(Notes notes){
        print("WoodWind.play()" + notes);
    }
    public String what(){
        return "WoodWind";
    }

}
class Brass extends Wind{
    public void play(Notes notes){
        print("Brass.play() " + notes);
    }
    public void adjust(){
        print("Brass.adjusting()");
    }
}
public class Music {
    public static void tune(Instruments instruments){
        instruments.play(Notes.C_SHARP);
    }
    public static void tuneAll(Instruments[] e){
        for(Instruments i : e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instruments[] ochersa = new Instruments[]{
                new Wind(),
                new Percussion(),
                new Stringed(),
                new WoodWind(),
                new Brass()
        };
        tuneAll(ochersa);
    }
}
