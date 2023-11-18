package learnjava2023;

public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Perfect! : You Passed!");
			break;

		case 'B':
			System.out.println("Well Done! : You Passed!");
			break;

		case 'C':
			System.out.println("Fine! : You Passed!");
			break;

		case 'D':
			System.out.println("Not Bad! : You Passed");
			break;

		case 'F':
			System.out.println("Very Bad! : You Failed!");
			break;

		default:
			System.out.println("Invalid Grade!!!");
		}

	}

}
