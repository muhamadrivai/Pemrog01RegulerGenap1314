//Created by Muhamad Rivai
//Update : 10 april 2014

package Praktikum03d.bin;

public class DemoVariabel {
	public static void main(String[] Rivai){
		int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("Nilai w adalah " +x);
		
		//type casting
		char v=(char) x;
		System.out.println("Nilai V adalah " +v);
		System.out.println("Baris Selanjutnya");
	}
	public static void coba(){
		//System.out.println("Nilai V adalah " +v);
	}
}
		
		
		
		