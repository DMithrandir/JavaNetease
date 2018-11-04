package dome;

public class DVD extends Item{
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
public DVD(String title, String artist, int numofTracks, String comment) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}



	public static void main(String[] args) {
		DVD dvd = new DVD("a","b",1, "...");
		dvd.print();
	}


public void print() {
	// TODO Auto-generated method stub
	
	}
}