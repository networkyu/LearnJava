package chapter.v;

class Rock2 {
    Rock2(int i) {// this is the constructor
        System.out.printf("chapter.v.Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}