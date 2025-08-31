package JavaSeleniumProgram;



public class SumAvgofnumber {

	static double sum=0;
	static double avg=0;
	
	
	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=65;
		number[1]=25;
		number[2]=35;
		number[3]=45;
		for(int i=0;i<4;i++)
		{
			sum=sum+number[i];
		}
		System.out.println("sum is :"+sum);
		
		avg=sum/number.length;
		System.out.println("Average is "+avg);

	}

}
