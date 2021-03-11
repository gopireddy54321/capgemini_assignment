import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter ur age: ");
int age = s.nextInt();

try {
	if (age < 15)
		throw new Exception("invalid age");
	else
		System.out.println("valid age");
}
catch (Exception a)
{
	System.out.println(a);
}

	}

}
