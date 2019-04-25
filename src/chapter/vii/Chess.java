package chapter.vii;
class Game{
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BorarGame extends Game {
    BorarGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BorarGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
