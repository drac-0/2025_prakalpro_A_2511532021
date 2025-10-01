package pekan4;
import java.util.Scanner;

public class tugasAlpropekan4_2511532021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hargaDasar = 50000;
		int persenHari =0;
		int persenWaktu =0;
		int persenStudio =0;
		int persenTotal = 0;
		String a = "";
		String b = "";
		String c = "";
		char persen = '%' ;
		
		System.out.print("Masukkan nama anda\t\t: ");
		String name = input.nextLine();
		
		System.out.print("Masukkan jumlah tiket\t\t: ");
		int JumlahTiket = input.nextInt();
		System.out.println("");
		
		System.out.println("1 = Senin-Kamis");
		System.out.println("2 = Jumat");
		System.out.println("3 = Sabtu-Minggu");
		
		
		System.out.print("Pilih hari menonton (1/2/3)\t: ");
		int Hari = input.nextInt();
		
		if (Hari == 1 ) {
			persenHari = 10;
			a = "Senin-Kamis";
		} else if (Hari == 2) {
			persenHari = 15; 
			a = "Jumat" ;
		} else if (Hari == 3) {
			persenHari = 20;
			a = "Sabtu-Minggu";
		}
		else {System.out.println("INVALID INPUT");}
		
		
		System.out.println("");
		
		System.out.println("1 = Pagi (10:00 - 12:00)");
		System.out.println("2 = Siang (12:00 - 17:00)");
		System.out.println("3 = Malam (17:00 - 22::00)");
		
		System.out.print("Pilih waktu menonton (1/2/3)\t: ");
		
		int Waktu = input.nextInt();

		if (Waktu == 1 ) {
			persenWaktu = 5;
			b = "Pagi" ;
		} else if (Waktu == 2) {
			persenWaktu = 10;
			b = "Siang" ;
		} else if (Waktu == 3) {
			persenWaktu = 15;
			b = "Malam" ;
		}
		else {System.out.println("INVALID INPUT");}
		
		System.out.println("");
		
		
		System.out.println("1 = Regular");
		System.out.println("2 = Deluxe");
		System.out.println("3 = Premium");
		System.out.print("Pilih studio menonton (1/2/3)\t: ");
		int Studio = input.nextInt();


		if (Studio == 1 ) {
			persenStudio = 10;
			c = "Reguler" ;
		} else if (Studio == 2) {
			persenStudio = 15;
			c = "Deluxe" ;
		} else if (Studio == 3) {
			c = "Premium" ;
			persenStudio = 20;
		}
		else {System.out.println("INVALID INPUT");}
		
		int PersenTotal = persenStudio + persenWaktu + persenHari;
		int HargaTiket = (hargaDasar + (hargaDasar * PersenTotal ) / 100) * JumlahTiket;
		
		System.out.println("=====PEMBELIAN TIKET BIOSKOP=====");
		System.out.println("Nama Pembeli\t: " + name);
		System.out.println("Jumlah Tiket\t: " + JumlahTiket);
		System.out.println("Hari Menonton\t: " + a);
		System.out.println("Waktu Tayang\t: " + b);
		System.out.println("Jenis Studio\t: " + c);
		System.out.println("---------------------------------");
		System.out.println("Harga Dasar\t: " + hargaDasar);
		System.out.println("Biaya Hari\t: " + persenHari + persen);
		System.out.println("Biaya Waktu\t: " + persenWaktu + persen);
		System.out.println("Biaya Studio\t: " + persenStudio + persen);
		System.out.println("---------------------------------");
		System.out.println("Total Biaya Tambahan\t: " + PersenTotal + persen);
		System.out.println("Total Bayar\t\t: " + HargaTiket + " Rupiah");
		
		
		
	}
	
}
