package JavaSeleniumProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAcceptRuntime {

	public static void main(String[] args) {
		int number[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the numbers");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(number));
	}

}
