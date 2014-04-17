//Created By Muhamad  Rivai
//Update : 17 April 2014

//Perintah control flow/struktur kontrol
//perintah pertama - contoh 03

package Latihan01.sesi1.bin;
import java.util.Random;

public class praktikum05c
{
	static boolean selesai = false;
	public static void main(String[] Rivai)
	{
		Integer faktor =7;
		System.out.println("mencari kelipatan " +faktor + " dengan while");
		while(!selesai)
		{
			cariKelipatan(faktor);
		}
		System.out.println("selesai mencari kelipatan dengan while");
		System.out.println();
		System.out.println();
		System.out.println("mencari kelipatan " +faktor + " dengan for");
		for(selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("selesai mencari kelipatan dengan for");
	}
public static void cariKelipatan(Integer faktor)
{
	Integer random = new Random().nextInt();
	System.out.println("bilangan random : " +random);
	
	if(random % faktor ==0)
	{
		System.out.println("kelipatan " +faktor + " ditemukan,yaitu : " +random);
		selesai = true;
	}
}
}