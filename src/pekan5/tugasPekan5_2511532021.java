package pekan5;

public class tugasPekan5 {
	public static void main(String[] args) {
		for (int i = 1 ; i<=5; i++) {
			for (int j = 1 ; j <= (5 - i); j++) {
				System.out.print(".");
			}
			System.out.print(i);
			for (int k = 1 ; k < i; k++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}
}
