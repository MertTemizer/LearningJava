package learnjava2023;

public class Arrays {

	public static void main(String[] args) {
	
		String[] students = new String[4];
		
		students[0] = "Mert";
		students[1] = "Ahmet";
		students[2] = "Merve";
		students[3] = "Elif";
		
		for (String student : students) {
			System.out.println(student);
		}

	}

}
