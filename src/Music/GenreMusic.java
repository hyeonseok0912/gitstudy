package Music;

public class GenreMusic extends Music {
	
	String genre;
	
	public GenreMusic() {
		
	}
	public GenreMusic(String name, String song) {
		super(name, song);
	}

	
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void printPlaydata(String Genremusic)	{
		System.out.print("(" + Genremusic + ")");
	}
}
