package ZooAnimal;

/**
 * Created by Unaer on 12/13/2016.
 */
public class TestZoo {

    public static void main(String[] args) {

        //new=calls out to the contructor
        Zoo myZoo = new Zoo(3);
        Otter olaf = new Otter();
        System.out.println(Mammal.count);
        Otter anna = new Otter("Alien");
        System.out.println(Mammal.count);
        Bear voli = new Bear();
        System.out.println(Mammal.count);
        //polymorphism
        myZoo.addAnimal(olaf, 0);
        myZoo.addAnimal(anna, 1);
        myZoo.addAnimal(voli, 2);


        myZoo.checkWeather();
        myZoo.feedAnimals();

        System.out.println(olaf.myGender);
        System.out.println(anna.myGender);

        olaf.setMyAge(3);
        System.out.println(olaf.getMyAge());
        anna.setMyAge(10);
        System.out.println(anna.getMyAge());
        voli.setMyAge(6);
        System.out.println(voli.getMyAge());

        //Scanner Portion






    }
}
