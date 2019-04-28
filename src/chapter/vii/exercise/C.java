package chapter.vii;
class A{
    A(int i){
        System.out.println("A constructor,strugments:"+i);
    }
}
class B{
    B(String str){
        System.out.println("B constructor,strugments:"+str);
    }

}
public class C extends A {
    C(){
        super(8);
        System.out.println("C constructor");
    }

    public static void main(String[] args) {
        C c = new C();
        B b = new B("Hello B");
    }
}
