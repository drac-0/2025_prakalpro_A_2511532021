package pekan2;
import java.util.Scanner;
import java.util.InputMismatchException;

///i learn how to do recursive func, i learn that a class must have a main function with argumen string and args, 
///and most importantly is how to get an input from user in java
 
public class tugasAlproPekan2 {
	public static void main(String[] args) {
		tugasAlproPekan2.datamahasiswa();
	}
	
	public static void datamahasiswa() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		
		
		/*handler error kalau input bukan true or false. kms*/
		try {
			
			System.out.print("Apakah Anda Mahasiswa Unand?\njawab menggunakan true/false\t : ");
			boolean ismahasiswa = scanner.nextBoolean() ;
			scanner.nextLine();

			/*if else condition blablabla*/
			if (ismahasiswa == true) {
				
				System.out.println(" === Pengambilan Data Mahasiswa === ");
				
				System.out.print("Masukkan NIM\t: ");
				String NIM = scanner.nextLine() ;
				
				System.out.print("Masukkan nama\t: ");
				String nama = scanner.nextLine() ;
				
				System.out.print("Masukkan umur\t: ");
				int umur = scanner.nextInt();
				
				System.out.print("Masukkan IPK\t: ");
				float IPK = scanner.nextFloat();
				
				System.out.println("\n === Penampilan Data Mahasiswa === ");
				System.out.println("NIM\t: " + NIM);
				System.out.println("Nama\t: " + nama);
				System.out.println("Umur\t: " + umur + " tahun\n");
				
				String strumur = Integer.toString(umur);
				System.out.println("Umur (String)\t : " + strumur );
				
				long nimPumur= Long.parseLong(NIM) + umur ;
				System.out.println("NIM + Umur\t : " + nimPumur);}
			
			else {
				System.out.println("JANGAN MASUK UNAND, APALAGI FTI\nBelajar yang bener biar bisa masuk ITB atau ITS");
				}
			
			} /*bracket milik try*/
		
		
		catch (InputMismatchException e) {
			System.out.println("Pilihannya cuman true atau false, ulangi lagi");
			tugasAlproPekan2.datamahasiswa();
		}
	}
}
