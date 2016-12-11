package abstractPractice;

public class Husky extends Dog {

	private String eyeColor;

	public Husky(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.eyeColor = "blue";
	}

	public Husky(String name, int age, String color) {
		super(name, age);

		this.eyeColor = color;
	}

	@Override
	public void sleep() {
		System.out.println("I slept for 3 hours.");
	}

	public void eat() {
		System.out.println("I'm a fat puppy");
	}

	public String getMyEyeColor() {
		return this.eyeColor;

	}
}
