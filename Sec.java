import java.util.Vector;
import java.lang.Math;

public class Sec {
	public double findYSec(double x) {
		return (1 / (Math.cos(x)));
	}

	public double findYFirstDerSec(double x) {
		return (Math.sin(x) / (Math.pow(Math.cos(x), 2)));
	}

	public double findYSecDerSec(double x) {
		return (((Math.pow(Math.sin(x), 2)) / (Math.pow(Math.cos(x), 3))) + (1 / (Math.pow(Math.cos(x), 3))));
	}

	private Vector<Double> xFirstDer;
	private Vector<Double> yFirstDer;
	private Vector<Double> xSecDer;
	private Vector<Double> ySecDer;
	private Vector<Double> xCoord;
	private Vector<Double> yCoord;
}
