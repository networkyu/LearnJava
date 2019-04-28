package chapter.vii.example;

import chapter.vii.exercise.Test_15;
class Test_15_2 extends Test_15{
    void method3(){
        protectedMethod();
    }
}
public class Test_15_1 {
    public static void main(String[] args) {
        Test_15 test = new Test_15();
        test.method();
        Test_15_2 test1 = new Test_15_2();
        test1.method3();
    }
}
