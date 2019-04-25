package chapter.vi;
class A{
    A(){
        System.out.println("A construct");
    }
}
class B{
    B(){
        System.out.println("B construct");
    }
}
public class C extends A{
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
    }
}
