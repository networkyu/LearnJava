package chapter.v;

import com.baidu.simple.PrintPackageName;
import com.baidu.simple.Vector;
import com.debugoff.*;

public class Main {

    public static void main(String[] args) {
        Test_5_1 testObj =  new Test_5_1();
        System.out.println(testObj.str);

        Test_5_2 test_5_2Obj = new Test_5_2();
        System.out.println(test_5_2Obj.str);

        Test_5_2_a test_5_2_aObj = new Test_5_2_a("I set String");
        System.out.println(test_5_2_aObj.str);

        // 调用的包名是
        PrintPackageName.printPackageName();
        Vector v = new Vector();
        Light redLight = new Light("red");
    }
}
