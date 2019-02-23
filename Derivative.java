
public class Derivative {
	public static Polynomial Derive(Polynomial polynomial) {
		Polynomial derivative = new Polynomial();
		for (int i = 0; i < polynomial.getNumTerms(); i++) {
			// compute derivative
			double c = polynomial.getCoefficient(i) * polynomial.getExponent(i);
			int exp = polynomial.getExponent(i);
			if (exp > 0) {
				exp--;
			}
			if (c != 0) {
				derivative.addTerm(c, exp);
			}
		}
		return derivative;
	}
}
