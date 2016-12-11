
public class Yorkie extends Dog{

	public Yorkie(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleep() {
		System.out.println("I slept for 10 hours");
		
	}

	public void bark(){
		
		System.out.println("Bark Barky");
	}
}
