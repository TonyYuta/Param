package core;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParameterizedTest {
	// Fields
	private int expected;
	private int first;
	private int second;
	
	// constructor instead Parameter for Field injection
	public ParameterizedTest(int expectedResult, int firstNumber, int secondNumber) {
		expected = expectedResult;
		first = firstNumber;
		second = secondNumber;
	}
	// test data generator
	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] {
			{ 3, 1, 2 },
			{ 5, 2, 3 },
			{ 5, 2, 3 },
			{ 5, 1, 6 },
			{ 5, 2, 3 },
			{ 5, 2, 4 },
			{ 5, 2, 3 },
			{ 5, 2, 3 },
			{ 5, 2, 2 },
			{ 5, 2, 6 },
			{ 5, 2, 7 },
			{ 5, 2, 3 },
			{ 7, 3, 2 },
			{ 9, 4, 5 }
			
		});}
	@Test
	public void sum() {
		Addition add = new Addition();
		System.out.println(first + " + " + second + " = " + expected);
		assertEquals(expected, add.addNumbers(first, second));
	}
}
