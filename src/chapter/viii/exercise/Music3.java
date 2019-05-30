package chapter.viii.exercise;

import java.util.Random;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
    void play(Note n){
        System.out.println("Instrument.play() "+ n);
    }
    public String toString(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    void play(Note n){
        System.out.println("Wind.play() "+ n);
    }
    public String toString(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play() "+ n);
    }
    public String toString(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play() "+ n);
    }
    public String toString(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}
class NewInstrument extends Instrument{
    void play(Note n){
        System.out.println("NewInstrument.play() "+ n);
    }
    public String toString(){
        return "NewInstrument";
    }
    void adjust(){
        System.out.println("Adjusting NewInstrument");
    }
}
class Brass extends Wind{
    void play(Note n){
        System.out.println("Brass.play() "+ n);
    }
    public String toString(){
        return "Brass";
    }
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}
class Woodwind extends Wind{
    void play(Note n){
        System.out.println("Woodwind.play() "+ n);
    }
    public String toString(){
        return "Woodwind";
    }
    void adjust(){
        System.out.println("Adjusting Woodwind");
    }
}
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
        System.out.println(i);
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args) {
//        Instrument[] orchestra = {
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind(),
//                new NewInstrument()
//        };
//        tuneAll(orchestra);
        InstrumentGenerator gen = new InstrumentGenerator();
        for (int i=0;i<20;i++){
            System.out.println(gen.next());
        }
    }
}
class InstrumentGenerator{
    Random gen = new Random(47);
    public Instrument next(){
        switch (gen.nextInt(6)) {
            default:
            case 0:return new Wind();
            case 1:return new Percussion();
            case 2:return new Stringed();
            case 3:return new Brass();
            case 4:return new Woodwind();
            case 5:return new NewInstrument();
        }
    }
}