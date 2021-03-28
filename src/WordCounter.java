import java.util.HashSet;

public class WordCounter {

	public static void main(String[] args) {
		String str = "give Me reason to prove me";
		String []split = str.split(" ");
		HashSet<String>values = new HashSet<String>();
		for (String S : split) {
			values.add(S);
			System.out.println(S);
			
		}
		int size = values.size();
		System.out.println(size);
		
		System.out.println();
		HashSet<String>set = new HashSet<String>();
		for (String S : split) {
			set.add(S.toLowerCase());
			System.out.println(S.toLowerCase());
		}
		int size2 = set.size();
		System.out.println(size2);
	}

}
