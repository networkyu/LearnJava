package chapter.vii.exercise;
class Desc{
    String desc;
    void dispose(){
        System.out.println("Desc dis pose");
    }
}
class Component1 extends Desc{
    Component1(String description){
        desc = description;
        System.out.println("Component1 constructor");
    }
    void dispose(){
        System.out.println("Component1 dis pose");
        super.dispose();
    }
}
class Component2 extends Desc{
    Component2(String description){
        desc = description;
        System.out.println("Component2 constructor");
    }
    void dispose(){
        System.out.println("Component2 dis pose");
        super.dispose();
    }
}
class Component3 extends Desc{
    Component3(String description){
        desc = description;
        System.out.println("Component3 constructor");
    }
    void dispose(){
        System.out.println("Component3 dis pose");
        super.dispose();
    }
}
public class Root extends Desc {
    Component1 com1;
    Component2 com2;
    Component3 com3;
    Root(String description){
        desc = description;
        com1 = new Component1(description);
        com2 = new Component2(description);
        com3 = new Component3(description);
        System.out.println("Root Constructor");
    }
    void dispose(){
        System.out.println("Root dis pose");
        super.dispose();
    }
}
