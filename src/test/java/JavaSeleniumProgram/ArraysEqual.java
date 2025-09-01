package JavaSeleniumProgram;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		int number[]= {34,45,67,86};
		int number1[]= {34,45,67,86};
		
		if (Arrays.equals(number, number1))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}
	