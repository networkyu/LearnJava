package chapter.v;

public class Test_5_5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(5,2.6f);
//        dog.bark(2.5f,5);
    }
}
class Dog{
    void bark(int i,float f){
        System.out.println("barking int float");
    }
    void bark(float f,int i){
        System.out.println("howling float int");
    }

}
