package latihan.bin;

public class ExceptionHanding
{
	public static void main(String[] Rivai)
	{
		int[] array = new int[3];
		try
		{
			array[5] = 1;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error!! " +e.toString());
		}
	}
}