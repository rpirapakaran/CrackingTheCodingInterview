package test.ch1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.ReverseC_StyleString;

class ReverseC_StyleStringTest {
	public ReverseC_StyleString tester;
	public String termCharString = "\0";
	public String nullString = null;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new ReverseC_StyleString();
	}

	@Test
	public void testreverseStringUsingArray() {

		assertTrue(tester.reverseStringUsingArray((nullString == null ? nullString : nullString + termCharString)) == (nullString));
		assertTrue(tester.reverseStringUsingArray("a" + termCharString).equals("a" + termCharString));
		assertTrue(tester.reverseStringUsingArray("ab" + termCharString).equals("ba" + termCharString));
		assertTrue(tester.reverseStringUsingArray("abc" + termCharString).equals("cba" + termCharString));
		assertTrue(tester.reverseStringUsingArray(" " + termCharString).equals(" " + termCharString));
		assertTrue(tester.reverseStringUsingArray("" + termCharString).equals("" + termCharString));

	}

	//
	@Test
	public void testcharacterreversing() {
		assertTrue(tester.characterreversing((nullString == null ? nullString : nullString + termCharString)) == (nullString));
		assertTrue(tester.characterreversing("a" + termCharString).equals("a" + termCharString));
		assertTrue(tester.characterreversing("ab" + termCharString).equals("ba" + termCharString));
		assertTrue(tester.characterreversing("abc" + termCharString).equals("cba" + termCharString));
		assertTrue(tester.characterreversing(" " + termCharString).equals(" " + termCharString));
		assertTrue(tester.characterreversing("" + termCharString).equals("" + termCharString));

	}
}
