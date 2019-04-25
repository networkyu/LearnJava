package chapter.v;

class Person {
    public void eat(Appel appel){
        Appel peeled = appel.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    static Appel peel(Appel apple){
        return apple;
    }
}
class Appel{
    Appel getPeeled(){
        return Peeler.peel(this);
    }
}
class TwoMethod{
    void method1(){
        method2();
        this.method2();

    }
    void method2(){
        System.out.println("method2");
    }
}
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Appel());
        TwoMethod method = new TwoMethod();
        method.method1();
    }

}
