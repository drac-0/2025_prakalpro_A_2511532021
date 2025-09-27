package pekan3;
import java.util.Scanner;

public class HitungVolume {
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius;
		double tinggi;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("masukkan radius tabung\t: ");
		radius = keyboard.nextInt();
		
		System.out.print("masukkan tinggi tabung\t: ");
		tinggi = keyboard.nextInt();
		
		double volume = radius * radius * tinggi * PI;
		String volumestr = String.format("%.2f", volume); //membatasi angka di belakang koma menjadi hanya 2
		
		System.out.println("Volume tabung adalah\t: " + volumestr) ;
		
	}
}
