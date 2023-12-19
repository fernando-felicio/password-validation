package password_validation;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String validPassword = "2002Fj";
		
		System.out.println("Type the password: ");
		String testPassword = sc.next();
		
		while (!testPassword.equals(validPassword)) {
			System.out.println("Wrong password, try again!");
			testPassword = sc.next();
		}
		
		System.out.println("Access allowed!");
		
		
		sc.close();
		

	}

}
