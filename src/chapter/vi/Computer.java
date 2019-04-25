package chapter.vi;

public class Computer {
    protected String os;
    void setOs(String os){
        this.os = os;
    }
}
class SetOs{
    public static void sets(Computer obj,String os){
        obj.os = os;
    }
}
