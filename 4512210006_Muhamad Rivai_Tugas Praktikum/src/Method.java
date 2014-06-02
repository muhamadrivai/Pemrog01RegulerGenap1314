package latihan.bin;

import java.util.Scanner;

public class Method
{
	public static void main(String[] Rivai)
	{
		Scanner input = new Scanner(System.in);
		Tuna tunaObject = new Tuna();
		System.out.println("enter your name here : ");
		String name = input.nextLine();
		tunaObject.simpleMessage (name);
	}
}