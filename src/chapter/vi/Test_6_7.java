package chapter.vi;

import com.ylp.util.Print;

public class Test_6_7 {
    public static void main(String[] args) {
        Widgt widget = new Widgt(3.2,"repair");
        widget.changeSize(3.2,5.0);
        Print.print(widget.toString());
    }
}
