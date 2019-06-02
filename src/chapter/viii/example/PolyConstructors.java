package chapter.viii.example;
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph.draw() before");
        draw();
        System.out.println("Glyph.draw() after");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int i){
        radius = i;
        System.out.println("RoundGlyph.RoundGlyph().radius="+radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw,radius="+radius);
    }
}
class RenctangularGlyph extends Glyph{
    private int width = 6;
    private int height =3;
    RenctangularGlyph(int w,int h){
        width = w;
        height = h;
        System.out.println(" RenctangularGlyph.RenctangularGlyph(),Renctangular width:"+width+" Height:"+height);
    }

    @Override
    void draw() {
        System.out.println("draw().Renctangular width:"+width+" Height:"+height);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
//        new RoundGlyph(5);
        new RenctangularGlyph(5,9);
    }

}
