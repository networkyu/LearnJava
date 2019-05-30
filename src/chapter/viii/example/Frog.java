package chapter.viii.example;
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic "+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic " + s);
    }
}
class Descripting{
    private String s ;
    Descripting(String s ){
        this.s = s;
        System.out.println("Creating Descripting "+ s);
    }
    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}
class LivingCreature{
    private Characteristic p = new Characteristic("isAlive");
    private Descripting t = new Descripting("Basic Living Creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature disposing  " );
        t.dispose();
        p.dispose();
    }

}
class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("has heart");
    private Descripting t = new Descripting("Animal not Vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Descripting t = new Descripting("Both water and land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Descripting t = new Descripting("Eats Bugs");
    public Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
