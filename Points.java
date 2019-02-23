import java.util.Vector;

public class Points {
	public Points(Polynomial polynomial, double minX, double maxX, double minY, double maxY) {
		xCoordinate = new Vector<Double>();
		yCoordinate = new Vector<Double>();
		for (double x = minX; x < maxX; x += 0.001) {
			double yValue = polynomial.findY(x);
			if (minY <= yValue && yValue <= maxY && minX <= x && x <= maxX) {
				xCoordinate.add(x);
				yCoordinate.add(yValue);
			}
		}
	}

	public void print() {
		for (int i = 0; i < xCoordinate.size(); i++) {
			System.out.println("x: " + xCoordinate.get(i) + "y: " + yCoordinate.get(i));
		}
	}

	private Vector<Double> xCoordinate;
	private Vector<Double> yCoordinate;
}
