package chapter.vii;

import com.ylp.util.Print;

class Art{
    Art(){
        Print.print("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}
public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
