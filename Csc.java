import java.util.Vector;
import java.lang.Math;

public class Csc {
	public double findYCsc(double x) {
		return (1 / (Math.sin(x)));
	}

	public double findYFirstDerCsc(double x) {
		return ((-Math.cos(x)) / (Math.pow(Math.sin(x), 2)));
	}

	public double findYSecDerCsc(double x) {
		return ((1 / (Math.pow(Math.sin(x), 3))) + ((Math.pow(Math.cos(x), 2)) / (Math.pow(Math.sin(x), 3))));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
