package latihan.bin;

import java.io.*;

public class TryCatchException
{
	static BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	public static void main(String[] Rivai)
	{
		try
		{
			System.out.println("Choose one of the options, (1-3) " + "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) CheeseBurger");
			System.out.println("masukan pilihan anda : ");
			String choose = input.readLine();
			if (choose.equals("1"))
			{
				System.out.println("anda memilih Steak :-)");
			}
			else if (choose.equals("2"))
			{
				System.out.println("anda memilih Lobster :-D");
			}	
			else if (choose.equals("3"))
			{
				System.out.println("anda memilih Cheeseburger ;-)");
			}
			else
			{	
				throw new Exception ("pilihan tidak ada !");
			}
		}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
