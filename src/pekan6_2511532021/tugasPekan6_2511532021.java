package pekan6_2511532021;
import java.util.*;

public class tugaspekan6_2511532021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Random ran = new Random();
		int percobaan = 0;
		
		while (true) {
			percobaan++;
			String jawab;
			int dadu1 = ran.nextInt(6) + 1;
			int dadu2 = ran.nextInt(6) + 1;
			int jumlah = dadu1 + dadu2;
			System.out.println("Angka yang anda dapatkan adalah : " + jumlah);
			
			if (jumlah == 7) {
				System.out.println("Selamat anda mendapatkan angka 7 setelah " + percobaan + " percobaan");
				break;}
			
			else {
				System.out.println("Anda belum mendapatkan angka 7");
				System.out.print("Apakah ingin mencoba lagi? (y/n) : ");
				jawab = input.nextLine();
				
				if (jawab.equalsIgnoreCase("n")) {
					System.out.println("ANDA KALAH, TOTAL PERCOBAAN bermain = " + percobaan);
					break;}
				}
		}
		input.close();
	}
}
