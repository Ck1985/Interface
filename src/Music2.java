/**
 * Created by Anonymous11100001 on 5/30/2016.
 */
import static tk.anonymous11100001.util.Print.*;
import polymorphism.Notes;

interface PlayAble{
    void play(Notes notes);
}
abstract class Instrument implements PlayAble{
    public void play(Notes notes){
        print("Instrument ");
    }
    public String toString(){
        return "Instrument";
    }
    public abstract void adjust();
}
class Wind extends Instrument implements PlayAble{
    public void play(Notes notes){
        print("Wind paly " + notes);
    }
    public String toString(){
        return "Wind";
    }
    public void adjust(){
        print("Wind is adjusting ....");
    }
}
class Percussion extends Instrument implements PlayAble{
    public void play(Notes notes){
        print("Percussion play " + notes);
    }
    public String toString(){
        return "Percussion";
    }
    public void adjust(){
        print("Percussion is adjusting ....");
    }
}
class Stringed extends Instrument implements PlayAble{
    public void play(Notes notes){
        print("Stringed play " + notes);
    }
    public String toString(){
        return "Stringed";
    }
    public void adjust(){
        print("Stringed is adjusting ...");
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
public class Music2{
    public static void tune(PlayAble playAble){
        playAble.play(Notes.C_SHARP);
    }
    public static void tuneAll(PlayAble[] playAbles){
        for(PlayAble i : playAbles){
            tune(i);
        }
    }
    public static void main(String[] args){
        PlayAble[] playAbles = new PlayAble[]{
                new Wind(),
                new Percussion(),
                new Stringed()
        };
        tuneAll(playAbles);
    }
}
