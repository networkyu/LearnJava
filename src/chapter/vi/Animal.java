package chapter.vi;

import com.ylp.util.Print;

public class Animal {
    public String name;
    public String  age;
    public Animal(){
        this.name = "猴子";
        this.age = "0";
    }
    protected void move(){
        Print.print("move");
    }
}
