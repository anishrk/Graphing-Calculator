import java.lang.Math;
import java.util.Vector;

public class Exponential {
	public double findY(double x) {
		return (Math.exp(x));
	}

	public void trigPoints(double minX, double maxX, double minY, double maxY) {
		xCoord = new Vector<Double>();
		yCoord = new Vector<Double>();
		double y;
		for (double x = minX; x < maxX; x += 0.001) {
			y = findY(x);
			if (minY <= y && y <= maxY) {
				xCoord.add(x);
				yCoord.add(y);
			}
		}
	}

	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
