package interfaces;

/**
 * Created by Anonymous11100001 on 6/4/2016.
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
class DragonZilla implements DangerousMonster{
    public void menace(){

    }
    public void destroy(){

    }
}
interface Lithall{
    void kill();
}
interface Vampire extends DangerousMonster, Lithall{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{
    public void menace(){

    }
    public void destroy(){

    }
    public void kill(){

    }
    public void drinkBlood(){

    }
}
public class HorrorShow {
    static void m(Monster monster){
        monster.menace();
    }
    static void d(DangerousMonster dangerousMonster){
        dangerousMonster.menace();
        dangerousMonster.destroy();
    }
    static void l(Lithall lithall){
        lithall.kill();
    }
    public static void main(String[] args){
        DangerousMonster barney = new DragonZilla();
        Vampire vampire = new VeryBadVampire();

        barney.destroy();
        barney.menace();
        vampire.drinkBlood();
        vampire.kill();
        vampire.menace();
        vampire.destroy();
    }
}
