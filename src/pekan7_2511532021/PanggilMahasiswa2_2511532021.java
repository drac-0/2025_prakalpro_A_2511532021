package pekan7_2511532021;
import java.util.*;

public class PanggilMahasiswa2_2511532021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM : ");
		String x = input.nextLine();
		System.out.print("Nama : ");
		String y = input.nextLine();
		Mahasiswa_2511532021 a = new Mahasiswa_2511532021();
		a.setNim2(x);
		a.setNama(y);
		if (x.startsWith("25")) {
			System.out.println("ANDA ANGKATAN 25");
		}
		
		if (x.contains("1153")) {
			System.out.println("ANDA MAHASISWA INFORMATIKA");
		}
		
		a.cetak2();
		input.close();
		
	}
}
