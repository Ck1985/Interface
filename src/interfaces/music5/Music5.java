package interfaces.music5;
import static tk.anonymous11100001.util.Print.*;
import polymorphism.Notes;

/**
 * Created by Anonymous11100001 on 5/29/2016.
 */
interface Instrument{
    // Compile time constant
    int VALUE = 5; // this field in interface always automatic is static and final
    void play(Notes notes); // methods in interface always automatic are publiv
    void adjust();
}
class Wind implements Instrument{
    public void play(Notes notes){
        print(this + ". play() " + notes);
    }
    public String toString(){
        return "Wind";
    }
    public void adjust(){
        print(this + " adjusting ....");
    }
}
class Percussion implements Instrument{
    public void play(Notes notes){
        print(this + " .play() " + notes);
    }
    public String toString(){
        return "Percussion";
    }
    public void adjust(){
        print(this + " adjusting ...");
    }
}
class Stringed implements Instrument{
    public void play(Notes notes){
        print(this + " .play() " + notes);
    }
    public String toString(){
        return "Stringed";
    }
    public void adjust(){
        print(this + " adjusting ....");
    }
}
class WoodWind extends Wind{
    public String toString(){
        return "WoodWind";
    }
}
class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}
public class Music5 {
    public static void tune(Instrument i){
        i.play(Notes.C_SHARP);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instrument[] orchesa = new Instrument[]{
                new Wind(),
                new Percussion(),
                new Stringed(),
                new WoodWind(),
                new Brass()
        };
        tuneAll(orchesa);
    }
}
