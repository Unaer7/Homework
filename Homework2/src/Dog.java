
public abstract class Dog implements Animal {

	private String myName;
	private int myAge;

	public Dog(String name, int age) {
		this.myName = name;
		this.myAge = age;
	}

	public abstract void sleep();

	public void eat() {
		System.out.println("Eating");
	}

	public int getMyAge() {

		return this.myAge;
	}

	public void setMyAge(int newAge) {
		this.myAge = newAge;
	}

	public String getMyName() {
		return this.myName;
	}

	public void setMyName(String newName) {
		this.myName = newName;
	}

}
