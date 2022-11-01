//asgh
public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello World!");

		String name = "Abraham";
		System.out.println("\nname = " + name);
		System.out.println("number of characters of variable name: " + name.length());

		int pos = name.indexOf('A');
		System.out.println("position: " + Integer.toString(pos));

		char letter = name.charAt(pos);
		System.out.println("letter. " + letter);
	}
}
