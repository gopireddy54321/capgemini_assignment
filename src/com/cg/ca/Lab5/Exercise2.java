import java.util.*;

public class Exercise2 {
	static void checkName(String firstName, String lastName) throws Exception {
		if (firstName.isEmpty() || lastName.isEmpty()) {
			throw new Exception("Please enter a name!!");
		} else
			System.out.println("Given name is accepted!");
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String fName = scanner.nextLine();
		String lName = scanner.nextLine();
		checkName(fName, lName);
	}
}
