package Music;

public class Music {
	
	String name;
	String song;
	
	public Music() {
		
	}
	public Music(String name, String song) {
		
		this.name = name;
		this.song = song;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSong() {
		return song;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public void printPlaydata()	{
		
		System.out.print(song + " of " + name);
	}

}
