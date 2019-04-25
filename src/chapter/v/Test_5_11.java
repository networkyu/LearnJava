package chapter.v;

enum PaperRuel{
    RUEL0,RUEL1,RUEL2,RUEL3,RUEL4,RUEL5


}
public class Test_5_11 {
    PaperRuel ruel;
    Test_5_11(PaperRuel ruel){
        this.ruel = ruel;
    }
    void describe(){
        System.out.println("Ruel is prince");
        switch (ruel){
            case RUEL0:
                System.out.println("price is 20");
                break;
            case RUEL1:
                System.out.println("price is 30");
                break;
            case RUEL2:
                System.out.println("price is 40");
                break;
            case RUEL3:
                System.out.println("price is 50");
                break;
            case RUEL4:
                System.out.println("price is 60");
                break;
                default:
                    System.out.println("未定价");
        }
    }
    public static void main(String[] args) {
        for (PaperRuel r : PaperRuel.values()) {
            System.out.println(r+",orinal " + r.ordinal());
        }
        Test_5_11 ruel1 = new Test_5_11(PaperRuel.RUEL1);
        ruel1.describe();
    }
}
