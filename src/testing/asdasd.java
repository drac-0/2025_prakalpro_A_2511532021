package testing;


import java.util.*;
public class asdasd {
	public static void main(String[] args) {
		int counter = 0;
		String jawab;
		boolean running = true;
		Scanner scan = new Scanner(System.in);
		while (true) {
				counter++;
				System.out.println("jumlah = " + counter);
				System.out.print("Apakah lanjut (ya/tidak) : ");
				jawab = scan.nextLine();
				if (jawab.equalsIgnoreCase("tidak")) {
					break;
				}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak = " + counter);
	}
}
