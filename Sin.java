import java.util.Vector;
import java.lang.Math;

public class Sin extends Trigonometry {
	public double findY(double x) {
		return (Math.sin(x));
	}

	public double findYFirstDer(double x) {
		return (Math.cos(x));
	}

	public double findYSecDer(double x) {
		return (-Math.sin(x));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
