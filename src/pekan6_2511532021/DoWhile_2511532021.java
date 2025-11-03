package pekan6_2511532021;
import java.util.*;
public class DoWhile_2511532021 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
			String phrase;
			do {
				System.out.print("Input Password : ");
				phrase = console.nextLine();
				
			} while (!phrase.equals("abcd"));
	}
}	
