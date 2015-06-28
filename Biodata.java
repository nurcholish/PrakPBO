package cholis;

public class Biodata {

static String nama = "cholis"; // variabel global
		String nim = "60200112010";
	
	public static void main (String args[])
	{
		System.out.println(nama); //nama di panggil dari variabel global
		System.out.println("nim"); //nim di panggil dari variabel global
		System.out.println("Jurusan Teknik Informaatika"); // langsung menampilkan 
		System.out.println(jumlah(5,2));
		System.out.println(kurang(1,40));
		System.out.println(kali(10,20));
		System.out.println(bagi(234,23));
		
	}
	
	static int jumlah(int i, int j){ //di buatkan variabel untuk mengeksekusi jumlah
		return i+j; // pengembalian nilai
	}
	static int kurang(int i, int j){
		return i-j;
	}
	static int kali(int i, int j){
		return i*j;
	}
	static float bagi(int i, int j){
		return i/j;
	}
}

