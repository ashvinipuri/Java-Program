package module2;

public class Artist
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("creating first object");
		MakeupArtist artist=new MakeupArtist();
	    artist.accept();
		artist.display();
		artist.addCertification();
	    artist.sendMessage();
		artist.bookAppointment();
	}

}
