package chapter.vii.exercise;
class Amphibian{
    void swing(){
        System.out.println("可以游泳");
    }
    void land(){
        System.out.println("可以陆生");
    }
    void feature(Amphibian a) {
        a.land();
        a.swing();
    }
}
public class Frog extends Amphibian{
    @Override void feature(Amphibian m){
        m.swing();
        System.out.println("重写方法");
    }
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.feature(frog1);
    }
}
