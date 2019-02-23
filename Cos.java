import java.util.Vector;
import java.lang.Math;

public class Cos {
	public double findYCos(double x) {
		return (Math.cos(x));
	}

	public double findYFirstDerCos(double x) {
		return (-Math.sin(x));
	}

	public double findYSecDerCos(double x) {
		return (-Math.cos(x));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
