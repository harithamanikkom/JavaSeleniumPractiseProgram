package Sep25;

import java.util.Arrays;

public class Countofnumbers {
	static int countofnumbers=0;
	public static void main(String[] args) {
		
		String name="Haritha123";
		char c[]=name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++)
		{
		boolean k1=Character.isDigit(c[i]);
		if(k1==true)
		{
			countofnumbers++;
		}
		}
		System.out.println("The count of numbers is: b  wedeed      " +countofnumbers);

	}

}
