package pekan7_2511532021;
import java.util.*;
public class tugasPekan7_2511532021 { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    DataTugasPekan7 x = new DataTugasPekan7 ();

	    String a,b,c;
	    int d,e;

	    System.out.println("==== REGISTRASI AKUN BARU ====");

	    System.out.print("Masukkan Username: ");
	    a = input.nextLine();
	    x.setName(a);
	    
	    System.out.print("Masukkan Password: ");
	    b = input.nextLine();
	    x.setPw(b);
	    
	    if (!x.isPasswordValid(b)) {
	    	System.out.println("INVALID PASSWORD!");
	    	System.out.println("COBA LAGI TOT");
	    	return;
	    }
	    
	    
	    
	    System.out.print("Masukkan Email: ");
	    c = input.nextLine();
	    x.setEmail(c);
	    
	    if (!x.isEmailValid(c)) {
	    	System.out.println("INVALID EMAIL!");
	    	System.out.println("TRY AGAIN");
	    	return;
	    }
	    
	    System.out.print("Masukkan PIN (6 digit): ");
	    d = input.nextInt();
	    x.setPin(d);
	    if (d > 999999) {
	    	System.out.println("PIN IS TOO LONG");
	    	System.out.println("TRY AGAIN");
	    	return;
	    }
	    
	    System.out.println("REGISTRASI BERHASIL");
	    System.out.println("Akun : " + x.getName() + "Dibuat");
	    System.out.println("");
	    
	    System.out.println("DETAIL AKUN");
	    System.out.println("Username (lowercase)\t: " + x.getName().toLowerCase());
	    System.out.println("Email (Uppercase)\t: " + x.getEmail().toUpperCase());
	    System.out.println("ID Pengguna (Gabungan)\t: " + x.getName().toLowerCase().concat(String.valueOf(x.getPin())));
	    System.out.println("");
	    
	    System.out.println("\n--- Uji Tipe Data (PIN Anda: " + x.getPin() + ") ---");
        System.out.println("PIN (int) + 10        = " + (x.getPin() + 10));
        System.out.println("PIN (String) + \"10\" = " +
                (x.getPin() + "10"));    
        
        input.close();
	        }
}
