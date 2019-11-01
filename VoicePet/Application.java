package JavaCore_5.VoicePet;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.voice();
        dog.voice();
        cow.voice();

    }
}
