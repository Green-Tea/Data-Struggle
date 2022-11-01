public class Playground {

    public static void playTwice(Animal a) {
        a.play();
        a.play();
    }

    public static void speakTwice(Speakable o) {
        o.speak();
        o.speak();
    }

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");

        Dog max = new Dog();
        max.setName("Max");

        spot.play();
        max.play();


        Cat fluffy = new Cat();
        fluffy.setName("Fluffy");
        fluffy.play();
        fluffy.pur();

        fluffy.setAge(1);
        System.out.println(fluffy.getAge());
        max.setAge(3);
        System.out.println(max.getAge());

        playTwice(max);
        playTwice(fluffy);

        Human human1 = new Human();
        human1.setName("Kanat");

        speakTwice(human1);
        speakTwice(fluffy);

        //speakTwice(spot); // error because dog does not implement speakable

        fluffy.fly();
    }
}
