package pekan2 ;

public class tugasAlproPekan2 {
	public static void main (String[] args) {
		/*deklarasi dan inisialisasi variabel*/

		boolean Livestatus = false;
		String Name = "Vincent Fennel";
		String Cause = "Suicide";
		int Age = 19 ;
		char BloodType = 'A' ;
		float BankBalance = 20.4f;
		char dollar = '$' ;
		float GravePrice = 10f;
		
		System.out.println(" ===CORPSE DATA=== ");
		System.out.println("Alive Status\t: "+ Livestatus); ///display data boolean
		System.out.println("Corpse Name\t: " + Name); ///display data string
		System.out.println("Cause of Death\t: " + Cause) ;
		System.out.println("Corpse Age\t: " + Age); ///display data integer
		System.out.println("Blood Type\t: " + BloodType); ///display data char

		/*Menampilkan data yang disimpan*/
		System.out.println("");
		System.out.println("Bank Balance\t: " + BankBalance + dollar); ///display data float
		System.out.println("Price For a Graveyard : " + GravePrice + dollar);
		
		float Sisa = BankBalance - GravePrice;
		System.out.println("Bank Balance after bill : " + Sisa + dollar);
	}
}
