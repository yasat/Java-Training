package Salary;
import java.util.*;

class Rectangle implements Shape
{
	public static void draw()
	{
		System.out.println("Inside Rectangle ");
	}
	
}
class Square implements Shape
{
	public static void draw()
	{
		System.out.println("Inside Square ");
	}
	
}
class Circle implements Shape
{
	public static void draw()
	{
		System.out.println("Inside Circle ");
	}
}

public class rectagle{
	public static void main(String[] args)
	{
		Rectangle.draw();
	}

}