package chapter.viii.exercise;
class A{
    public void method1(){
        System.out.println("A method1");
        method2();
    }
    public void method2(){
        System.out.println("A mehod2");
    }
}
class B extends A {
    @Override
    public void method2() {
        System.out.println("B method2 继承自A并重写");
    }
}
public class E10 {
    public static void main(String[] args) {
        B b = new B();
        A  a = b;
        a.method1();
    }
}
