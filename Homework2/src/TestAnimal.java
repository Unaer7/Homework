
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog yorkie= new Dog

		Husky dog1 = new Husky("Fluffy", 2, "green");

		dog1.sleep();
		dog1.eat();
		System.out.println(dog1.getMyAge());

		dog1.setMyAge(3);
		System.out.println(dog1.getMyAge());
		System.out.println("my name is " + dog1.getMyName() + ".");

		dog1.setMyName("Liela");

		System.out.println("YAY~ I got adopted! My new name is..." + dog1.getMyName());

		System.out.println("My eyes are..." + dog1.getMyEyeColor());

		Husky dog2 = new Husky("Luffy", 1, "Pink");
		System.out.println("New Dog name , age , eyecolor iss..." + dog2.getMyName() + " " + dog2.getMyAge() + " "
				+ dog2.getMyEyeColor());
		
		Yorkie dog3= new Yorkie("Samsung",2);
		dog3.bark();
		dog3.sleep();
		dog3.eat();
		System.out.println("-----");
		//polymorphism
		Dog dog4 = new Husky("Polly", 5);
		
		dog4.eat();
		
		dog4 = new Yorkie("Polly", 5);
		
		dog4.eat();
		
		Animal dog5 = new Husky("Irene", 8);
		
	}
}
