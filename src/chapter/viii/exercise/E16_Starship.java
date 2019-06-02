package chapter.viii.exercise;
class Star{
    void light(){

    }
}
class RedStar extends Star{
    @Override
    void light() {
        System.out.println("Red");
    }
}
class BlueStar extends Star{
    @Override
    void light() {
        System.out.println("Blue");
    }
}
class YellowStar extends Star{
    @Override
    void light() {
        System.out.println("Yellow");
    }
}
class Stage{
    Star star = new BlueStar();
    void modefiyStatus(String color){
        switch (color){
            case "yellow": star = new YellowStar();break;
            case "blue":star = new BlueStar();break;
            case "red":star = new RedStar();break;
            default:break;
        }


    }
}
public class E16_Starship {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.star.light();
        stage.modefiyStatus("red");
        stage.star.light();
    }
}
