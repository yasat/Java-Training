package rishav;

interface Shape
{
	public static void draw()
	{
		
	}
}
class Rectangle implements Shape
{
	public static void draw()
	{
		System.out.println("Inside rectangle draw");
	}
	
}
class Square implements Shape
{
	public static void draw()
	{
		System.out.println("Inside square draw");
	}
	
}
class Circle implements Shape
{
	public static void draw()
	{
		System.out.println("Inside circle draw");
	}
}

public class prog3{
	public static void main(String[] args)
	{
		Rectangle.draw();
	}

}
