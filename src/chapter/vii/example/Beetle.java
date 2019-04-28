package chapter.vii.example;
class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i="+i+", j="+j);
        j = 39;
    }
    private static int x1  = printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k="+k);
        System.out.println("j="+j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        Insect insect = new Insect();
        Insect insect1 = new Insect();
        Beetle beetle = new Beetle();
        printInit("Hello");
        Beetle2019 beetle2019 = new Beetle2019();
    }
}
class Beetle2019 extends Beetle{

}