package praktikum14c.bin;

public class Circle extends GraphicObject
{
	void resize()
	{
		System.out.println("circle resize");
	}
	void drawShape()
	{
		System.out.println("circle shape");
	}
	void posisition()
	{
		System.out.println(this.x + this.y);
	}
}