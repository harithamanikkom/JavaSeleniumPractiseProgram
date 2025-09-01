package JavaSeleniumProgram;

import java.util.Arrays;

public class ArraysCopy {

	
	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=34;
		number[1]=67;
		number[2]=86;
		number[3]=65;
		int number1[]=new int[number.length];
		for(int i=0;i<4;i++)
		{
			number1[i]=number[i];
		}
		System.out.println("Original number is: " +Arrays.toString(number));
		System.out.println("Copy of the Array is :" +Arrays.toString(number1));

	}

}
