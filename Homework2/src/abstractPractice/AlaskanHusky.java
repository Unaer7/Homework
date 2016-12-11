package abstractPractice;

public class AlaskanHusky extends Husky{

	public AlaskanHusky(String name, int age) {
		super(name, age);
	}
	
	public AlaskanHusky(String name, int age, String eyeColor) {
		super(name, age, eyeColor);
	}
	
	public void Mush(){
		System.out.println("I'm gonna run real fast!");
	}
	
}
