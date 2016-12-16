package ZooAnimal;

/**
 * Created by Unaer on 12/13/2016.
 */
public abstract class Mammal implements ZooAnimal {
    static int count = 0;
    String myGender;
    //encapsulation
    private int myAge;
    final int numberOfEyes = 2;

    //implementation will be defined in child class
    public abstract void play();

    public int getMyAge() {

        return this.myAge;
    }

    public void setMyAge(int newAge) {
        this.myAge = newAge;
    }

}

