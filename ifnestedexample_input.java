import java.util.InputMismatchException;
import java.util.Scanner;
public class Ifnesdetedexample_input {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int umur = 0;
		String hamil;
		System.out.print("Berapa Umur Anda (Hanya Angka) : ");
		try {
			umur = scan1.nextInt();
			if(umur>=18) {
				Scanner scan2 = new Scanner(system.in);
				System.out.println("Apakah Sedang Hamil? (ya/tidak) : ");
				hamil = scan2.nextLine();
				
				if(hamil.toLowerCase().equals("tidak")) {
					System.out.println("Vaksin Jenis AstraZeneca");
				}else if(hamil.toLowerCase().equals("ya")) {
					System.out.println("Vaksin Jenis Sinovac");
					System.out.println("Vaksin Jenis pfizer");
					System.out.println("Vaksin Jenis Moderna");
				}else {
					System.out.println("Input Anda Tidak Sesuai");
				}
			}else {
				System.out.println("Vaksin Jenis Sinovac");
			}
		}catch (InputMismatchException a) {
			System.out.print("Anda memasukan Angka."};
			
		}
	}

}
