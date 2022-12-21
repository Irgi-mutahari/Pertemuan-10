import java.util.Scanner;
public class Bilanganganjilgenap {
	public static void main(String args[])
	{
		int angka;
		System.out.println("Masukan angka : ");
		Scanner masukan = new Scanner(System.in);
		angka = masukan.nextInt();
		
		//Tanpa Kurawal
		//if ( angak % 2 == 0 }
		//		system.out.println("Bilangan Genap");
		//else
		//		system.out.println("Bilangan Ganjil");
		
		//Dengan kurawal
		if ( angka % 2 == 0 ) {
			System.out.println("Bilangan Genap");
		}else {
			System.out.println("Bilangan Ganjil");
		}
	}

}
