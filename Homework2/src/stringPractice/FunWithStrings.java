package stringPractice;

public class FunWithStrings {

	public static void main(String[] args) {
		String myString = "Hellooooo.....it's me;I am Sam";

		System.out.println("My string is: " + myString);

		System.out.println("total # of characters = " + myString.length());

		System.out.println("split string on ';' = " + myString.split(";")[0]);
		System.out.println("split string on ';' = " + myString.split(";")[1]);
		System.out.println("substring between 0 and 7 is ..." + myString.substring(0, 7));
		System.out.println("Replace.." + myString.replace('H', 'S'));
		System.out.println("yay upper case now .." + myString.toUpperCase());
		System.out.println("lower case turn " + myString.toLowerCase());
		System.out.println(myString.concat(myString));
		System.out.println(myString.indexOf(myString));
		System.out.println(myString.codePointAt(0));
		System.out.println(" beginning letter is..."+ myString.charAt(0));
		System.out.println(myString.codePointBefore(7));
		System.out.println(myString.endsWith(myString));
		System.out.println(myString.compareToIgnoreCase(myString));
		System.out.println(myString.trim());
		System.out.println(myString.contentEquals(myString));
		System.out.println(myString.indexOf(myString));
		System.out.println(myString.codePointAt(0));
		System.out.println(" beginning letter is..."+ myString.charAt(0));
		System.out.println(myString.codePointBefore(7));
		System.out.println(myString.endsWith(myString));
		System.out.println(myString.compareToIgnoreCase(myString));
		System.out.println(myString.trim());
		System.out.println(myString.contentEquals(myString));
		
		
	}

}
