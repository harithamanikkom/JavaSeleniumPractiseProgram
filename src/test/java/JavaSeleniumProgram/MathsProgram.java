package JavaSeleniumProgram;

import java.util.Arrays;

public class MathsProgram {

	public static void main(String[] args) {
		int number1 = 35;
		int number2 = 65;
		System.out.println("Addition is " + Math.addExact(number1, number2));

		System.out.println("Substraction is " + Math.subtractExact(number1, number2));
		System.out.println("Multiplication  is " + Math.multiplyExact(number1, number2));

		String s1 = "taste";
		String s2 = "make";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not Anagram");
		}

	}

}
