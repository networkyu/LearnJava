package chapter.v;

class AcceptString {
    AcceptString(String str){
        System.out.println("Structor accept string is : "+str);
    }
}
public class Test_5_16 {
    public static void main(String[] args) {
        AcceptString[] acceptString;
        acceptString = new AcceptString[] {
                new AcceptString("first"),
                new AcceptString("second"),
        };
        String[] str0 = {"a","b","c"};
        String[] str1 = new String[5];
        for (int i = 0 ; i < str1.length;i++) {
            str1[i] = "ui88";
        }
        String[] str2  = {
                new String("a"),
                new String("b"),
                "c",
        };
        String[] str3 = new String[] {
                "a",
                "b",
                "c",
        };
        for (int i = 0; i <str3.length ; i++) {
//            System.out.println(str3[i]);
        }
    }
}
