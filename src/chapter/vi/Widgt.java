package chapter.vi;

public class Widgt {
    double size;
    String function;
    public Widgt(double size,String function){
        this.size = size;
        this.function = function;
    }
    public void changeSize(double originalSize,double newSize){
        if (this.size == originalSize){
            this.size = newSize;
        }
    }
    void  changeFunction(String function){
        this.function = function;
    }

    @Override
    public String toString() {
        return "size:"+this.size+" function: "+this.function;
    }
}
