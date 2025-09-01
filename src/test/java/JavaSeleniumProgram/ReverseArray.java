package JavaSeleniumProgram;

import java.util.Arrays;

public class ReverseArray {

	static int k=0;
	public static void main(String[] args) {
		int number[]= {100,200,300,400};
		int number1[]=new int[number.length];
		for (int i=number.length-1;i>=0;i--)
		{
			number1[i]=number[k];
					k++;
		}
		System.out.println("Original String: "+Arrays.toString(number));
		System.out.println("Reverse String: "+Arrays.toString(number1));
		

	}

}
