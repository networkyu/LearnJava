package chapter.vi;

import com.ylp.util.Print;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Print.print(cat1.age);
        cat1.move();
        Computer computer = new Computer();
        computer.setOs("Linux");
        Print.print(computer.os);
        SetOs setOsObj = new SetOs();
        setOsObj.sets(computer,"Mac");
        Print.print(computer.os);
    }
}
