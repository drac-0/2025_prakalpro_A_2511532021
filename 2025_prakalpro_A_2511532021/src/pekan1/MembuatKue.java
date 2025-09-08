package pekan1;

public class MembuatKue {
	public static void main(String[] args) {
		makeBatter();
		memanggang();
		memanggang();
		menghias();
	}
	
	//Buat adonan kue
	public static void makeBatter() {
		System.out.println("Campur bahan kering.");
		System.out.println("Krim mentega dan gula.");
		System.out.println("Kocok telurnya.");
		System.out.println("Campur bahan kering.");
	}
	
	//panggang sekumpulan kue
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengatur waktu.");
		System.out.println("Masukkan kue ke dalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
	}

	//hiasi cookie
	public static void menghias() {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting dan taburan");
	}
}

