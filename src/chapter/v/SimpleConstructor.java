package chapter.v;

class Rock {
    Rock() {// this is the constructor
        System.out.printf("chapter.v.Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}