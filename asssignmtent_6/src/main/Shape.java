package main;

class Shape {
	protected int x, y;
  	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	private int width = 10, height = 20;
	
	Rectangle()
	{
		super.x = width;
		super.y = height;
	}
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
  
class Triangle extends Shape {
	private int base = 30, height = 40;
	
	Triangle()
	{
		super.x = base;
		super.y = height;
	}
	
  	public void draw() {
		System.out.println("Triangle Draw");
	}
}
  
class Circle extends Shape {
	private int radius = 50;
	
	Circle()
	{
		super.x = radius;
	}
  
	public void draw() {
		System.out.println("Circle Draw");
	}
}