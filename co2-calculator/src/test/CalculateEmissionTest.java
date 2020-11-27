package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import calculator.CalculateEmission;

public class CalculateEmissionTest {
	
	final String medium_diesel_car = "medium-diesel-car";
	final String large_petrol_car = "large-petrol-car";
	final String train = "train";
	
	final double dist_1 = 15;
	final double dist_2 = 1800.5;
	final double dist_3 = 14500;
	
	@Test
	public void testCalculate_1() {
		CalculateEmission cal = new CalculateEmission();
		double actualResult = cal.calculate(medium_diesel_car, dist_1);
		assertEquals(2565.0, actualResult, 0.1);
		
	}
	
	@Test
	public void testCalculate_2() {
		CalculateEmission cal = new CalculateEmission();
		double actualResult = cal.calculate(large_petrol_car, dist_2);
		assertEquals(507741.0, actualResult, 0.1);
		
	}
	
	@Test
	public void testCalculate_3() {
		CalculateEmission cal = new CalculateEmission();
		double actualResult = cal.calculate(train, dist_3);
		assertEquals(87000.0, actualResult, 0.1);
		
	}
	
	@Test
	public void testCalculateNullScenario() {
		CalculateEmission cal = new CalculateEmission();
		assertNull(cal.calculate("dummy-value", dist_3));
	}
}
