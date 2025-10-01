package pekan3;
import java.util.Scanner;


public class programpenghitunggaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pengambilan data
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        char golongan = input.next().toUpperCase().charAt(0); //to upper case method untuk mengubah lowercase menjadi uppercase

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        // menentukan upah per jam
        int upahPerJam;
        if (golongan == 'A') {
            upahPerJam = 1000;
        } else if (golongan == 'B') {
            upahPerJam = 2000;
        } else if (golongan == 'C') {
            upahPerJam = 3000;
        } else if (golongan == 'D') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return;
        }

        // Menghitung upah pokok
        int upahPokok = jamKerja * upahPerJam;

        // Menghitung upahLembur dari si karyawan
        int upahlembur = 0;
        if (jamKerja > 60) {
            upahlembur = (jamKerja - 60) * 5000;
        }

        int totalUpah = upahPokok + upahlembur;

        // penampilan data
        System.out.println("=== INFORMASI GAJI KARYWAN ===")
        System.out.println("Nama Karyawan\t: " + nama);
        System.out.println("Total Upah\t: " + totalUpah + "Rupiah");
        System.out.println("Golongan karyawan\t: " + golongan);
        System.out.println("Total Jam Kerja\t: " + jamKerja + "jam");

        input.close();

	}
	
}
