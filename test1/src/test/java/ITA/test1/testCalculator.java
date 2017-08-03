package ITA.test1;

import junit.framework.TestCase;

public class testCalculator extends TestCase {

	public void test() {
	Calculator cal = new Calculator();
	System.out.println("Sum: " + cal.Add(2, 1));
	System.out.println("Difference: " + cal.Subtract(2, 1));
	System.out.println("Product: " + cal.Multiply(2, 1));
	System.out.println("Quotient: " + cal.Divide(2, 1));
	}
}
