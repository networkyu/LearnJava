package chapter.vii.exercise;

import java.util.Random;

public class Test_18 {
    Random rand = new Random(25);
    public static final int VALUE_0 = 9;
    public static final int VALUE_1 = new Random(25).nextInt(20);
    public final int VALUE_2 =  10;
    public final int VALUE_3 = rand.nextInt(20);
    void pringResult(){
        System.out.println(VALUE_0);
        System.out.println(VALUE_1);
        System.out.println(VALUE_2);
        System.out.println(VALUE_3);
    }

    public static void main(String[] args) {
        Test_18 test = new Test_18();
        test.pringResult();
        Test_18 test1 = new Test_18();
        test1.pringResult();
    }
}
