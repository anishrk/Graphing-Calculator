import java.util.Vector;

public class Trigonometry {
	public double findY(double x) {
		return 0;
	}

	public double findYFirstDer(double x) {
		return 0;
	}

	public double findYSecDer(double x) {
		return 0;
	}

	public void trigPoints(double minX, double maxX, double minY, double maxY) {
		xFirstDer = new Vector<Double>();
		yFirstDer = new Vector<Double>();
		xSecDer = new Vector<Double>();
		ySecDer = new Vector<Double>();
		xCoord = new Vector<Double>();
		yCoord = new Vector<Double>();
		double yFirst;
		double ySec;
		double y;
		for (double x = minX; x < maxX; x += 0.001) {
			yFirst = findYFirstDer(x);
			ySec = findYSecDer(x);
			y = findY(x);
			if (minY <= yFirst && yFirst <= maxY) {
				xFirstDer.add(x);
				yFirstDer.add(yFirst);
			}
			if (minY <= ySec && ySec <= maxY) {
				xSecDer.add(x);
				ySecDer.add(ySec);
			}
			if (minY <= y && y <= maxY) {
				xCoord.add(x);
				yCoord.add(y);
			}
		}
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
