import static org.junit.Assert.*;

import org.junit.*;


public class TestCalculator {
	Calculator c = new Calculator();
	@Test
	public void square_root_true_positive()
	{
		double n = c.square_root(25);
		assertEquals(5.0,n,0.0);
		n = c.square_root(3);
		assertEquals(1.7320508075688772,n,0.0);
	}

	@Test
	public void square_root_false_positive()
	{
		double n = c.square_root(20);
		assertNotEquals(5.0,n,0.0);
		n = c.square_root(-1);
		assertNotEquals(1.7320508075688772,n,0.0);
	}
	
	@Test
	public void factorial_true_positive()
	{
		Calculator c = new Calculator();
		int n = c.factorial(0);
		assertEquals(1,n);
		n = c.factorial(4);
		assertEquals(24,n);
	}

	@Test
	public void factorial_false_positive()
	{
		Calculator c = new Calculator();
		int n = c.factorial(10);
		assertNotEquals(1,n);
		n = c.factorial(1);
		assertNotEquals(24,n);
	}

	@Test
	public void ln_function_true_positive()
	{
		Calculator c = new Calculator();
		double n = c.ln_function(1);
		assertEquals(0.0,n,0.0);
		n = c.ln_function(4);
		assertEquals(1.3862943611198906,n,0.001);
	}

	@Test
	public void ln_function_false_positive()
	{
		Calculator c = new Calculator();
		double n = c.ln_function(10);
		assertNotEquals(0.0,n,0.0);
		n = c.ln_function(40);
		assertNotEquals(1.3862943611198906,n,0.001);
	}
}