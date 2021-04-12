package Music;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		String name[] = {"Beethoven", "Handel", "Vivaldi"};
		String song[] = {"Destiny", "Messiah", "Four Seasons"};
		String Genre[] = {"Symphony", "Oraorio", "Concerto"};
		
		ArrayList<GenreMusic> list = new ArrayList<GenreMusic> ();
		
		GenreMusic music = new GenreMusic();
		int count = 0;
		
		for (int i=0; i < 6; i++) {
			music = new GenreMusic(name[count], song[count]); 
			list.add(music);
			
			if (i % 2 != 0)	{
				count++;
			}
		}
		
		count = 0;
		
		for (int i=0; i < list.size(); i++) {
			list.get(i).printPlaydata();
			
			if (i % 2 != 0)	{
				music.printPlaydata(Genre[count]); 
				count++;
			}
			System.out.println(); 
		}
	}

}
