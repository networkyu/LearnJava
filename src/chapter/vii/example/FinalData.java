package chapter.vii.example;

import java.util.Random;

class Value{
    int i;
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id ;
    public FinalData(String id){
        this.id = id;
    }
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static void main(String[] args) {

    }
}
