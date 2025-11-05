package pekan6_2511532001;

import java.util.Random;
import java.util.Scanner;

public class tugasPekan6 {
	public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Random acak = new Random();
        int tries = 0;
        boolean berjalan = true;
        
         while(berjalan) {
            tries++;
            int hasil = play(input, acak);
            if (hasil == 1 ) { 
                System.out.println("Anda menang setelah" + " " + tries + " " + "percobaan!");
                return;
            } else if ( hasil == 2) {
                System.out.println("Anda Gagal Menang!");
                return;
            }
        }
         input.close();
    }
    
    public static int play (Scanner input, Random acak) {
        String jawab;
        int operands = acak.nextInt(2) + 2;
        int sum = acak.nextInt(2) + 1;
        System.out.print(sum);
        
        for (int i =2; i <= operands; i++) {
            int n = acak.nextInt(2) + 1; 
            sum += n;
            System.out.print(" + " + n);
        }
        System.out.print(" = ");
        
        int guess = input.nextInt();
        input.nextLine();
        
        if (guess == sum) {
            System.out.println("Tebakkan Anda Benar");
            return 1;
        } else {
            System.out.println("Tebakkan Anda salah");
        }
        
        System.out.print("Apakah Lanjut (ya / tidak): ");
        jawab = input.nextLine().trim();
        
        if (jawab.equalsIgnoreCase("tidak")) {
            return 2;
        }
        
        return 0;
        
        
  }
}
