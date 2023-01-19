import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nama;
		String alamat;
		int umur;
		int nim;
		
		System.out.println("Input Data Mahasiswa Ilmu Komputer UNIDA");
		
		System.out.println("Masukkan nama kamu : ");
		nama = scanner.nextLine();
		
		System.out.println("Masukkan alamat kamu : ");
		alamat = scanner.nextLine();
		
		System.out.println("Masukkan umur kamu : ");
		umur = scanner.nextInt();
		
		System.out.println("Masukkan nim kamu : ");
		nim = scanner.nextInt();
		
		System.out.println("\n********************************");
		
		System.out.println("--------Member Data Mahasiswa Ilkom----------");
		
		System.out.println("Nama kamu = " + nama);
		System.out.println("Alamat kamu = " + alamat);
		System.out.println("Umur kamu = " + umur);
		System.out.println("Nim kamu = " + nim);
		
		System.out.println("*************************************");
	}
}