package chapter.v;

class printStringArgs {
    printStringArgs(String... args){
        for (String i : args){
            System.out.println(i);
        }
    }
    void method1(String[] args){
        for (String i : args){
            System.out.println(i);
        }
    }
    void method2(Object[] args){
        String[] newArgs = (String[]) args;
        for (String i : newArgs){
            System.out.println(i);
        }
    }
    void method3(String... args){
        if (args.length > 0){
            for (String i : args){
                System.out.println(i);
            }
        }else {
            System.out.println("参数为空");
        }

    }
}
public class Test_5_19 {
    public static void main(String[] args) {
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
        printStringArgs strObj = new printStringArgs(new String[]{"a", "a", "b"});
        strObj.method1(str1);
        strObj.method2(str3);
        strObj.method3();
    }
}
