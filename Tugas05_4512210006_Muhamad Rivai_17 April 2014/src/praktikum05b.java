//Created By Muhamad  Rivai
//Update : 17 April 2014

//Perintah control flow/struktur kontrol
//Perintah pertama - contoh 02

package Latihan01.sesi1.bin;

public class praktikum05b
{
	public static void main(String[] Rivai)
	{
		String[][] daftarNilai = new String[][]
		{
		new String[]{"001", "A"},
		new String[]{"002", "B"},
		new String[]{"003", "A"},
	};
	System.out.println("LOOPING MENGGUNAKAN FOR");
	
	for(int i=0; i<daftarNilai.length;i++)
	{
		System.out.println("NPM		: " +daftarNilai[i][0]);
		System.out.println("Nilai	: " +daftarNilai[i][1]);
	}
	System.out.println("SELESAI LOOPING FOR");
	System.out.println();
	System.out.println();
	System.out.println("LOOPING MENGGUNAKAN WHILE");
	int ix = 0;
	
	while(ix < daftarNilai.length)
	{
		System.out.println("NPM		: " +daftarNilai[ix][0]);
		System.out.println("Nilai	: " +daftarNilai[ix][1]);
		ix++;
	}
	System.out.println("SELESAI LOOPING WHILE");
}
}