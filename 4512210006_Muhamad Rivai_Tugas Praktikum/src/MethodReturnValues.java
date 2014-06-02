package latihan.bin;

public class MethodReturnValues
{
	public static void main(String[] Rivai)
	{
		myMethod();
		int myInt = 0;
		System.out.println(myInt);
		myInt = myMethod();
		System.out.println(myInt);
	}
	
	static int myMethod()
	{
		System.out.println("this computer is lagging!");
		return 4;
	}
}