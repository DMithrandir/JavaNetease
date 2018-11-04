package dome;

public class CD extends Item{
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playingTime, 
			String comment) {
		super(title,playingTime,false,comment);
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	
	public static void main(String[] args) {
		CD cd = new CD("a","b",2,2,"...");
		cd.print();
	}
	
	public boolean equals(CD obj,int j) {
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
		
	}

//	public void print() {
//		System.out.print(title+":");
//	}

}
