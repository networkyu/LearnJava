package chapter.v;

class Article {
    int length;
    String name;
    Article(int i){
        this(i,"unKnowName");
    }
    Article(int i,String str){
        length = i;
        name = str;
    }
}
public class Test_5_9 {


    public static void main(String[] args) {
        Article arct = new Article(8);
        System.out.println("length:"+arct.length+ " name:"+arct.name);

    }
}
