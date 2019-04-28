package chapter.vii.exercise;

/**
 * 练习 11
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a){s += a;}
    public void dilute(){append(" dilute()");
        System.out.println("S:"+this.s);}
    public void apply(){append(" apply()");}
    public void scrub(){append(" scrub");}
    public String toString(){return s;}
}
class CleanserDelegation{
    private String name;
    private Cleanser cleanser = new Cleanser();
    public CleanserDelegation(String name){
        this.name = name;
    }
    // delegation method
    public void dilute(){
        cleanser.dilute();
    }
}
public class Detergent {
    public static void main(String[] args) {
        CleanserDelegation delegation = new CleanserDelegation("delegation");
        delegation.dilute();
    }
}
