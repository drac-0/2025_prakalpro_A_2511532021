package pekan2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class tugasAlproPekan2 {
	public static void main (String[] args) {
		/*deklarasi dan inisialisasi variabel*/
		boolean status = true;
		String nama = "Muhammad Faiz An-Anri";;
		int umur = 19 ;
		char kelas = 'A' ;
		float IPK = 3.44f;
		
		System.out.println(" ===BIODATA FAIZ=== "); 
		System.out.println("Nama\t: " + nama); ///display data string
		System.out.println("Umur\t: " + umur); ///display data integer
		System.out.println("Kelas\t: " + kelas); ///display data char
		System.out.println("IPK\t: " + IPK); ///display data float
		System.out.println(nama + " adalah mahasiswa\t : " + status); ///display data boolean
	}
}
