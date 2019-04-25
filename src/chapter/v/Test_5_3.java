package chapter.v;

class Cat{
    String str ;
    Cat(){
        System.out.println("为这个类创建一个对象");
    }
    Cat (String s){
        System.out.println(s);
    }
}
public class Test_5_3 {
    public static void main(String[] args) {
       Cat cat = new Cat("我是有参数的" );

    }
}
