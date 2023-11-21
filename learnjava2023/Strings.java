package learnjava2023;

public class Strings {

	public static void main(String[] args) {
	
		String message = "Today is a great day.";
		System.out.println(message);
		
		System.out.println("Number of elements: " + message.length());
		System.out.println("Fifth Element: " + message.charAt(4));		
		System.out.println(message.concat(" Yay!."));
		System.out.println(message.startsWith("T"));
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("a"));
	}

}
