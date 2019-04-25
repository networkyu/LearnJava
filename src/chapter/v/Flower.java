package chapter.v;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower (int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount+" + petalCount);
    }
    Flower (String ss) {
        System.out.println("Constructor w/ String arg only,s = " + ss);
        s =ss;
    }
}
