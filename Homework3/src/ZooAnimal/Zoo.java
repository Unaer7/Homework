package ZooAnimal;

/**
 * Created by Unaer on 12/13/2016.
 */
public class Zoo {
    String weather;
    ZooAnimal[] animals;

    public Zoo() {
        //zoo does not match the signature used in TestZoo.
        // TODO: instantiate the weather variable
        animals = new ZooAnimal[10];
    }

    public Zoo(int size) {
        // TODO: instantiate the weather variable
        animals = new ZooAnimal[size];
    }

    public void checkWeather() {
        // TODO: print the value of weather
        System.out.println("sunny!");
    }


    public void feedAnimals() {
        int i = 0;
        while (i < animals.length) {

            animals[i].eat();
            i++;
        }
    }

    //polymorphism
    //place holders
    public void addAnimal(ZooAnimal animal, int index) {
        try{
            animals[index] = animal;
        }
        catch (Exception ex){
            System.out.println("Hey buddy, I don't have that many cages");
        }
        //always execute regardless an error or not :D
        finally {
            System.out.println("Attempted to add an animal to the zoo");
        }
    }

}
