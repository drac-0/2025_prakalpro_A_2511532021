package pekan8_2511532021;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("MASUKKAN BATAS ANGKA : ");
		int b = input.nextInt();
		System.out.println(jumlah(7));
	}
	public static int jumlah(int batas) {
		int a = 0;
		for (int i=0;i<=batas;i++) {
			if (i % 2 == 1) {
				a = a + i;
			}
			else {
				continue;
			}
		}
	}
}