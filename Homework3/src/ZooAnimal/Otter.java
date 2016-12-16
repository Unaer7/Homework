package ZooAnimal;

/**
 * Created by Unaer on 12/13/2016.
 */
public class Otter extends Mammal {
    public Otter() {
        count++;
        myGender = "Male";
    }

    public Otter(String gender) {
        count++;
        myGender = gender;
    }

    @Override
    public void eat() {
        System.out.println("burp");
    }

    @Override
    public void sleep() {
        System.out.println("slept for 4 hours");
    }

    @Override
    public void play() {
        System.out.println("swimming");
    }
}
