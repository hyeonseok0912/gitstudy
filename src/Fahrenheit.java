import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȭ���µ� �Է� : ");
	 
		int fahrenheit; 
	    fahrenheit = sc.nextInt();
	    
	    double celcius;
	    celcius = (double)5/9 * (fahrenheit-32);
	    
	    System.out.printf("����: %f" , celcius);
	}
}