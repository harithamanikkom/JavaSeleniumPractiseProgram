package JavaSeleniumProgram;

abstract class AbstractGoogleFunctionality {

	 abstract void search();
	 void message()
	 {
		 System.out.println("Thankyou for using Google!!!!");
	 }
 }
 class searchAll extends AbstractGoogleFunctionality{
	 
	 void search()
	 {
		 System.out.println("All search Results");
	 
 }
 }
	 class searchImage extends AbstractGoogleFunctionality
	 {
		 void search()
		 {
			 System.out.println("Image Search Results");
		 }
	 }
	 class searchVideo extends AbstractGoogleFunctionality
	 {
		 void search()
		 {
			 System.out.println("Video Search Results");
		 }
	 }
		



