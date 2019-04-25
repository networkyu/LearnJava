package chapter.v;

class Phone {
    boolean call = false;
    boolean game = false;
    boolean music = false;
    boolean photo = false;
    void inspec(){
        if (!call) {
            System.out.println("Error： No chapter.v.Phone Function");
        }
    }
    Phone(boolean canCall,boolean canGame,boolean canMusic,boolean canPhoto) {
        call = canCall;
        game = canGame;
        music = canMusic;
        photo = canPhoto;
    }
    void publish(Phone phone) {
        System.out.println("release:" + phone.call );
    }
    protected void finalize() {
        if (!call) {
            System.out.println("Error： no phone unable call");
        }

    }
}
public class Test_5_10 {
    public static void main(String[] args) {
        Phone nokiaPhone = new Phone(true,false,false,false);
        Phone gameMachine = new Phone(false,true,false,false);
//        gameMachine.inspec();
        nokiaPhone = null;
        gameMachine = null;
        System.gc();
    }
}