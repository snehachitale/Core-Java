
abstract class Shape {

	public abstract void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("This is a line");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("This is a rectangle");
	}
}

class Cube extends Shape {
	public void draw() {
		System.out.println("This is a cube");
	}
}

public class Shape1 {
	public static void main(String[] args) {
		
		Shape s1;
		
		s1 = new Line();
		s1.draw();
		
		s1 = new Rectangle();
		s1.draw();
		
		s1 = new Cube();
		s1.draw();
	}
}
