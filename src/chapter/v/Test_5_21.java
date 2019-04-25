package chapter.v;

public class Test_5_21 {
    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        tank1.storage(tank1);
        System.out.println(tank1);
        System.gc();
    }
}
class Tank {
    // tank states is Full?
    boolean states = false;
    Tank(boolean condion){
        states = condion;
    }
    boolean storage (Tank tank) {
        if (tank.states) {
            System.out.println("Storage failer");
            return false;
        } else  {
            System.out.println("Storage success");
            return  true;
        }
    }
    protected void finalize(){
        if (!states) {
            System.out.println("Error : chapter.v.Tank is Full,unable storage");
        } else  {
            System.out.println("Error : chapter.v.Tank is not full ,storage success");
        }
    }
}