package JavaSeleniumProgram;

public interface  WhatsappCalls {
	void calls();
	void mute();
	void disconnect();
}

class AudioCall implements WhatsappCalls
{
	
	public void calls()
	{
		System.out.println("Whatsapp Audio calls!!!!!");
	}
	
	public void mute()
	{
		System.out.println("Mute Audio calls!!!!!");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnect Audio calls!!!!");
	}
}

class VideoCall implements WhatsappCalls
{
	public void calls()
	{
		System.out.println("Whatsapp Video calls");
	}
	
	public void mute()
	{
		System.out.println("Mute Video calls");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnect Video calls");
	}
}