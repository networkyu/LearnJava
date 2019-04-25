package chapter.v;

class Tree{
    int height;
    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Create new chapter.v.Tree that is "+ height +" feet tall");
    }
    void info(String s){
        System.out.println(s + ":chapter.v.Tree is " + height + " feet tall");
    }
    void info(){
        System.out.println("chapter.v.Tree is " + height + " feet tall");
    }
}
public class OverLoading {
    public static void main(String[] args) {
        for (int i = 0; i<5;i++){
            Tree t = new Tree(i);
            t.info();
            t.info("chapter.v.OverLoading method");
        }
        new Tree();
    }
}
