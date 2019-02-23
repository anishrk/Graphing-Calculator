import java.util.Vector;

public class Extrema {
	public Extrema(Polynomial polynomial, double minX, double maxX) {
		minXCoordinate = new Vector<Double>();
		minYCoordinate = new Vector<Double>();
		maxXCoordinate = new Vector<Double>();
		maxYCoordinate = new Vector<Double>();
		Polynomial derivative = Derivative.Derive(polynomial);
		double x = derivative.findZeroes(minX, maxX);
		double yLeft = derivative.findY(x - 0.0001);
		double yRight = derivative.findY(x + 0.0001);
		if (yLeft > 0) {
			if (yRight < 0) {
				maxXCoordinate.add(x);
				maxYCoordinate.add(polynomial.findY(x));
			}
		} else if (yLeft < 0) {
			if (yRight > 0) {
				minXCoordinate.add(x);
				minYCoordinate.add(polynomial.findY(x));
			}
		}
	}

	public void print() {
		System.out.println("minX: " + minXCoordinate + "minY: " + minYCoordinate);
	}

	private Vector<Double> minXCoordinate;
	private Vector<Double> minYCoordinate;
	private Vector<Double> maxXCoordinate;
	private Vector<Double> maxYCoordinate;
}
