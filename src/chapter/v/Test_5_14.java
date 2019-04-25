package chapter.v;

class Name{
    static String firstName;
    static String familyName;
    static {
         familyName = "Yu";
    }
    Name(){
        System.out.println("firstName:"+firstName+" familyName:"+ familyName);
    }
    static void printName(){
        System.out.println("firstName:"+firstName+" familyName:"+ familyName);
    }
}
public class Test_5_14 {
    public static void main(String[] args) {
        Name.printName();
    }
}
