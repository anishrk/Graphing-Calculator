import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Vector;

public class PolynomialParser {
	public static Polynomial Parse(String function) {
		PolynomialParser p = new PolynomialParser(function);
		return p.polynomial;
	}

	private PolynomialParser(String function) {
		f = function;
		terms = new Vector<String>();
		polynomial = new Polynomial();
		parseFunction(f);
	}

	public void parseFunction(String f) {
		Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
		Matcher m = pattern.matcher(f);
		while (m.find()) {
			if (m.group(1).length() > 0) {
				terms.add(m.group(1));
				parseTerm(m.group(1));
			}
		}
	}

	public void parseTerm(String term) {
		String[] items = term.split("x");
		double c = 1.0;
		int exp = 0;
		// In a term like 2x, this if statement checks if there is a ^ and x.
		// If there's an x, but no caret, it will set exponent to 1.
		if ((term.indexOf("x") != -1) && (term.indexOf("^") == -1)) {
			exp = 1;
		}
		for (int i = 0; i < items.length; i++) {
			if (items[i].length() > 0) {
				// System.out.println("'" + items[i] + "'");
				if (items[i].substring(0, 1).compareTo("^") == 0) {
					// extract exponent
					exp = Integer.parseInt(items[i].substring(1));
				} else {
					// extract coefficient
					if (items[i].compareTo("-") == 0) {
						c = -1.0;
					} else if (items[i].compareTo("+") == 0) {
						c = 1.0;
					} else {
						c = Double.parseDouble(items[i]);
					}
				}
			}
		}
		polynomial.addTerm(c, exp);
	}

	// data members
	private String f;
	private Vector<String> terms;
	private Polynomial polynomial;
}
