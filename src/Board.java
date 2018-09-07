
public class Board {
	Shape board[] = new Shape[4];
	private double area;

	public Board() {
	}

	public void getAllShape() { // get all shape
		System.out.println("All Shape on Board:");
		for (Shape sh : board) {
			if (sh == null) {
				System.out.println("Empty");
			} else {
				System.out.println(sh);
			}
			System.out.println();
		}
		for (Shape sh : board) {
			if (sh != null) {
				setArea(sh.getArea() + sh.getArea());
			}
		}
		System.out.println("All shape area " + area);
	}

	public void dellShape(int i) {
		System.out.println("Dell in the number " + "'" + i + "'" + " Shape: " + board[i]);
		System.out.println();
		board[i] = null;
	}

	public void addShape(Shape shape) {
		for (int i = 0; i <= board.length - 1; i++) {
			if (board[i] == null) {
				System.out.println(shape + ": add to number " + i);
				board[i] = shape;
				System.out.println();
				break;
			}

		}
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

}
