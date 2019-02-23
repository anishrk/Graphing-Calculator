import java.util.Vector;
import java.lang.Math;

public class Polynomial {
	public Polynomial() {
		coefficient = new Vector<Double>();
		exponent = new Vector<Integer>();
		numTerms = 0;
	}

	public void addTerm(double c, int exp) {
		coefficient.add(c);
		exponent.add(exp);
		numTerms++;
	}

	public int getNumTerms() {
		return numTerms;
	}

	public double getCoefficient(int index) {
		return coefficient.get(index);
	}

	public int getExponent(int index) {
		return exponent.get(index);
	}

	public void print() {
		for (int i = 0; i < getNumTerms(); i++) {
			System.out.println("Term : " + getCoefficient(i) + ", " + getExponent(i));
		}
	}

	public double findY(double x) {
		double yValue = 0;
		for (int i = 0; i < coefficient.size(); i++) {
			yValue += coefficient.get(i) * Math.pow(x, exponent.get(i));
		}
		return yValue;
	}

	public double findZeroes(double x1, double x2) {
		if (findY(x1) == 0) {
			return x1;
		}
		if (findY(x2) == 0) {
			return x2;
		}
		double x = (x1 + x1) / 2;
		double xWithNegY = 0;
		double xWithPosY = 0;

		if (findY(x1) > findY(x2)) {
			xWithNegY = x2;
			xWithPosY = x1;
		} else if (findY(x2) > findY(x1)) {
			xWithNegY = x1;
			xWithPosY = x2;
		}

		int count = 0;
		while (Math.abs(findY(x)) > 0) {
			if (findY(x) > 0) {
				xWithPosY = x;
			} else {
				xWithNegY = x;
			}
			x = (xWithNegY + xWithPosY) / 2;
			count++;
			if (count > 100) {
				break;
			}
		}
		return x;
	}

	// DATA MEMBERS
	private Vector<Double> coefficient;
	private Vector<Integer> exponent;
	private int numTerms;
}
