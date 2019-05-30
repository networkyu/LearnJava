package chapter.viii.exercise;
class Rodent{
    public void hop(){
        System.out.println("Rodent hopping");
    }
    public void scurry(){
        System.out.println("Rodent scurry");
    }
    public void reproduce(){
        System.out.println("Rodent reproduce");
    }
    public String toString(){
        return "Rodent";
    }
}
class Mouse extends Rodent{
    public void hop(){
        System.out.println("Mouse hopping");
    }
    public void scurry(){
        System.out.println("Mouse scurry");
    }
    public void reproduce(){
        System.out.println("Mouse reproduce");
    }
    public String toString(){
        return "Mouse";
    }
}
class Gerbil extends Rodent{
    public void hop(){
        System.out.println("Gerbil hopping");
    }
    public void scurry(){
        System.out.println("Gerbil scurry");
    }
    public void reproduce(){
        System.out.println("Gerbil reproduce");
    }
    public String toString(){
        return "Gerbil";
    }
}
class Hamster extends Rodent{
    public void hop(){
        System.out.println("Hamster hopping");
    }
    public void scurry(){
        System.out.println("Hamster scurry");
    }
    public void reproduce(){
        System.out.println("Hamster reproduce");
    }
    public String toString(){
        return "Hamster";
    }
}
public class E09Rodent {

    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent r:rodents){
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
