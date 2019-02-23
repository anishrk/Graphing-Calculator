import java.util.Vector;

public class RationalExpression {
	public RationalExpression(String term) {
		String[] expressions = term.split("/");
		numerator = PolynomialParser.Parse(expressions[0]);
		denominator = PolynomialParser.Parse(expressions[1]);
	}

	public void print() {
		System.out.print("Num: ");
		numerator.print();
		System.out.println();
		System.out.print("Den: ");
		denominator.print();
		System.out.println();
	}

	public double findY(double x) {
		double numValue = numerator.findY(x);
		double denValue = denominator.findY(x);
		return (numValue / denValue);
	}

	public Vector<Double> checkForHoles(double minX, double maxX) {
		Vector<Double> xHole = new Vector<Double>();
		double increment = 0.00001;
		for (double x = minX; x < maxX; x += increment) {
			System.out.println("x: " + x + " x2: " + x + increment);
			double xNumZero = numerator.findZeroes(x, x + increment);
			System.out.println("xNumZero: " + xNumZero + " Y: " + numerator.findY(xNumZero));
			if ((xNumZero <= maxX) && Math.abs(numerator.findY(xNumZero)) <= Double.MIN_VALUE) {
				System.out.println("xNumZero: " + xNumZero + " x: " + x);
				System.out.println("yvalue: " + denominator.findY(xNumZero));
				if (Math.abs(denominator.findY(xNumZero)) <= 1e-9) {
					System.out.println("adding: " + xNumZero);
					xHole.add(xNumZero);
				}
			}
		}
		return xHole;
	}

	public void rationalExpPoints(RationalExpression ratexp, double minX, double maxX, double minY, double maxY) {
		xCoordinate = new Vector<Double>();
		yCoordinate = new Vector<Double>();
		double denValue = 0;
		double numValue = 0;
		int i = 0;
		for (double x = minX; x < maxX; x += 0.001) {
			denValue = denominator.findY(x);
			numValue = numerator.findY(x);
			if (denValue != 0) {
				double yValue = numValue / denValue;
				if (minY <= yValue && yValue <= maxY) {
					xCoordinate.add(x);
					yCoordinate.add(yValue);
				}
			}
			System.out.println("x-val: " + xCoordinate.get(i) + "y-val: " + yCoordinate.get(i));
			i++;
		}
	}

	private Polynomial numerator;
	private Polynomial denominator;
	private Vector<Double> xCoordinate;
	private Vector<Double> yCoordinate;
}
