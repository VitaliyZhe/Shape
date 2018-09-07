
public class Main {
	public static void main(String[] args) {

		Circle circle1 = new Circle(new Point(3, 1), new Point(5, 2));
		Circle circle2 = new Circle(new Point(3, 1), new Point(7, 1));
		Triangle triangle1 = new Triangle(new Point(3, 3), new Point(4, 5), new Point(6, 3));
		Square square1 = new Square(new Point(8, 3), new Point(4, 4));
		System.out.println("Area circle: " + circle1.getArea() + " Area triangle: " + triangle1.getArea()
				+ " Area square: " + square1.getArea() + " Area circle2: " + circle2.getArea());
		System.out.println();
		Board board = new Board();
		board.addShape(circle1);
		board.addShape(triangle1);
		board.addShape(square1);
		board.addShape(circle2);

		board.dellShape(3);
		board.getAllShape();

	}
}
