package JavaSeleniumProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Please enter your age");
			int age = sc1.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Sorry this doesn't seem to be age,Please check again");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Please enter your age again");
			int age1 = sc2.nextInt();
		}

	}

}
