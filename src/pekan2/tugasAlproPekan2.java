package pekan2;
import java.util.Scanner;

public class tugasAlproPekan2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println(" === Data Mahasiswa === ");
		
		
		System.out.print("Masukkan NIM\t: ");
		String NIM = scanner.nextLine() ;
		
		System.out.print("Masukkan nama\t: ");
		String nama = scanner.nextLine() ;
		
		System.out.print("Masukkan umur\t: ");
		int umur = scanner.nextInt();
		
		System.out.println(" === Data Mahasiswa === ");
		System.out.println("NIM\t: " + NIM);
		System.out.println("Nama\t: " + nama);
		System.out.println("Umur\t: " + umur + " tahun\n");
		
		String strumur = Integer.toString(umur);
		System.out.println("Umur (String)\t : " + strumur );
		
		long nimPumur= Long.parseLong(NIM) + umur ;
		System.out.println("NIM + Umur\t : " + nimPumur);
		
	}
}
