import java.util.Vector;
import java.lang.Math;

public class Cot {
	public double findYCot(double x) {
		return (1 / (Math.tan(x)));
	}

	public double findYFirstDerCot(double x) {
		return ((-1 / (Math.pow(Math.sin(x), 2))));
	}

	public double findYSecDerCot(double x) {
		return ((2 * Math.cos(x)) / (Math.pow(Math.sin(x), 3)));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
