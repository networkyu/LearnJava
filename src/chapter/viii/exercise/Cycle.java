package chapter.viii.exercise;

public class Cycle {
    public int wheels;
    Cycle(){
        wheels = 0;
    }
    void ride(Cycle cycle){
        System.out.println("通过ride方法将子类的对象向上转型传入该方法 cycle:"+cycle.toString());
        int whe = wheels(cycle);
        System.out.println(whe);
    }
    int wheels(Cycle cycle){
       return  cycle.wheels;
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        unicycle.ride(unicycle);
        bicycle.ride(bicycle);
        tricycle.ride(tricycle);

    }
}
class Unicycle extends Cycle{
    Unicycle(){
        wheels = 2;
    }
}
class Bicycle extends Cycle{
    Bicycle(){
        wheels= 4;
    }
}
class Tricycle extends  Cycle{
    Tricycle(){
        wheels = 12;
    }
}
