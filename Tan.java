import java.util.Vector;
import java.lang.Math;

public class Tan {
	public double findYTan(double x) {
		return (Math.tan(x));
	}

	public double findYFirstDerTan(double x) {
		return (1 / (Math.pow(Math.cos(x), 2)));
	}

	public double findYSecDerTan(double x) {
		return ((2 * Math.tan(x)) / (Math.pow(Math.cos(x), 2)));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
