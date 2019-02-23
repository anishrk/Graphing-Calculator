import java.util.Vector;

public class Calculator {
	public static void main(String[] args) {
		// polynomialTest("x^4+x^3-2x^2");
		// rationalExpressionTest("x^3+6x^2+9x+4/x^3+8x^2+19x+12");
		logarithmTest("log_5(x)");
	}

	public static void polynomialTest(String expression) {
		Polynomial p;
		p = PolynomialParser.Parse(expression);
		p.print();
		System.out.println("derivative");
		Polynomial derivative = Derivative.Derive(p);
		derivative.print();
		System.out.println("second derivative");
		Polynomial secondDerivative = Derivative.Derive(derivative);
		secondDerivative.print();
		p.findZeroes(-3.2, -3.1);
		Extrema extrema = new Extrema(p, -2, 1);
		extrema.print();
	}

	public static void rationalExpressionTest(String expression) {
		RationalExpression c = new RationalExpression(expression);
		c.print();
		System.out.println(c.checkForHoles(-5, 0));
		c.rationalExpPoints(c, 0, 1, 0, 1);
		Vector<Double> a = c.checkForHoles(-4.0, -0.99999);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

	public static void logarithmTest(String expression) {
		Logarithm l = new Logarithm(expression);
		l.logarithmPoints(0, 3, 0, 3);
		l.print();
	}
}
