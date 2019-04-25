package chapter.vii;
class BaseClass{
    BaseClass(String name,Object... args){
        System.out.println("className:"+name+"Prop:"+args[0]);
    }
}
public class TestEight extends BaseClass{
    TestEight(){
        super("base",new String[] {"1","2","3"});
    }
    TestEight(String name){
        super(name,new int[]{3,4,6});
    }

    public static void main(String[] args) {
        TestEight eight = new TestEight();
    }
}
