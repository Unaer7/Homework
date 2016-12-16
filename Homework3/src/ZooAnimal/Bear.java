package ZooAnimal;

/**
 * Created by Unaer on 12/13/2016.
 */
public class Bear extends Mammal {

    public Bear() {
        count++;
    }

    @Override
    public void play() {
        System.out.println("flip");
    }

    @Override
    public void eat() {
        System.out.println("rawr");
    }

    @Override
    public void sleep() {
        System.out.println("snore");
    }
}
