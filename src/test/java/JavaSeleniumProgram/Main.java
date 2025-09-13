package JavaSeleniumProgram;



public class Main {

	public static void main(String[] args) {
//		searchAll a =new searchAll();
//		searchImage i=new searchImage();
//		searchVideo v=new searchVideo();
//		a.search();
//		a.message();
//		//i.search();
//		//i.message();
//		//v.search();
//		//v.message();
		AudioCall a=new AudioCall();
		VideoCall c=new VideoCall();
		a.calls();
		a.mute();
		a.disconnect();
		
		c.calls();
		c.disconnect();
     	c.mute();
		
		
	}

}
