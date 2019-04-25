package chapter.vii;

import com.ylp.util.Print;

class Second{

}
public class Simple {
    Second second;

    @Override
    public String toString() {
        if (second == null) {
            second = new Second();
        }
        return "second:"+second;
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
        Print.print(simple);
    }
}
