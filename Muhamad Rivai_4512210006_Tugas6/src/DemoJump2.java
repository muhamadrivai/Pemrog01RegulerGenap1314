//Created by Muhamad Rivai
//Update : 21 April 2014

//perintah kelima - contoh 05
package Latihan01.sesi1.bin;
import java.util.Random;

public class DemoJump2
{
	public static void main(String[] Rivai)
	{
		Integer faktor =7;
		Integer jumlahFaktorDiinginkan = 4;
		Integer batasAtas = 10000000;
		Integer jumlahFaktorDitemukan = 0;
		System.out.println("mencari kelipatan " +faktor + " dengan break dan continue");
		while (true)
		{
			Integer random = new Random().nextInt();
			System.out.println("bilangan random : " +random);
			if(random > batasAtas)
			{
				System.out.println("mencari batas atas, langsung selesai");
				return;
			}
			if(random % faktor == 0)
			{
				System.out.println("kelipatan " +faktor + " ditemukan yaitu : " +random);
				jumlahFaktorDitemukan++;
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan)
				{
					System.out.println("baru menemukan "+jumlahFaktorDitemukan+ " faktor");
					System.out.println("dari "+jumlahFaktorDiinginkan + " yang dimimta, lanjut lagi");
					continue; 
				}
			}
				else 
				{
					System.out.println("sudah menemukan " +jumlahFaktorDiinginkan + " selesai looping");
					break;
				}
		}
				{
				System.out.println("selesai Mencari kelipatan");
				}
	}
}
				
