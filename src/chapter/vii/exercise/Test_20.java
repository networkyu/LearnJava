package chapter.vii.exercise;
class ClassA {
    private final void method1 (){
        System.out.println("this is method1 private final");
    }
     void method2(){
        System.out.println("this is method2 private");
    }
}
class ClassB extends ClassA {
    private final void method1 (){
        System.out.println("this is method1 private final");
    }
}
class ClassC extends ClassB{
     final void method1 (){
        System.out.println("this is ClassC method1 private final");
    }

    final void method2(){
        System.out.println("this is ClassC method2 private");
    }
}

public class Test_20 {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.method1();
        c.method2();
        ClassB b = c;

    }
}
