package main;

public class ShapeTest_2 {
	private static Shape arrayOfShapes[];
	
  	public static void printLocation(Shape s) {
		System.out.println("x=" + s.x + " y=" + s.y);
	}
  	
  	public static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Shape();
		arrayOfShapes[1] = new Rectangle();
		arrayOfShapes[2] = new Triangle();
		arrayOfShapes[3] = new Circle();
	}
  	
  	public static void main(String arg[]) {
  		
  		init();
  		drawAll();
  		getAll();
  		
  		
	}
  	
  	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
  	}
  	
  	public static void getAll()
  	{
		for (int i = 0; i < arrayOfShapes.length; i++) {
			printLocation(arrayOfShapes[i]);
		}
  		
  	}
}
