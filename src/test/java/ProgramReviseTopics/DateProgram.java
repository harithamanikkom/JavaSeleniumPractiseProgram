package ProgramReviseTopics;

import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		//Date d2=new Date(d1.getTime()+(1000*60*60*24*2));To get future date
		//Date d2=new Date(d1.getTime()-(1000*60*60*24*2));To get past date
		
		System.out.println(d2);
		String currentTime=d2.toString();
		String year=currentTime.substring(currentTime.length()-4);
		System.out.println("Year is :"+year);
		String month=currentTime.substring(4,7);
		System.out.println("Month is : "+month);
		String date=currentTime.substring(8,10);
		System.out.println("Date is : "+date);
		String dateformat1=date.concat(month).concat(year);
		System.out.println(dateformat1);
		String dateformat2=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateformat2);
		String dateformat3=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(dateformat3);


	}

}
