package dome;

public class Item {
	private String title;
	//private子类不能直接用如果使用 super传导
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	
	public Item(){
		
	}
	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void print() {
		System.out.println("Item");
	}

}
