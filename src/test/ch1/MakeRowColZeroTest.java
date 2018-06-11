package test.ch1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.ZeroMatrix;

class MakeRowColZeroTest {
	public ZeroMatrix tester;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new ZeroMatrix();
	}

	@Test
	public void testmakerow_col_zero() {
		
		int[][] matrix = { 	
				{1,2,3,4},
				{1,0,3,4},
				{1,2,3,4},
				{1,2,3,0}};
		
		int[][] zero_matrix = { 			
				{1, 0, 3, 0},
				{0, 0, 0, 0},
				{1, 0, 3, 0},
				{0, 0, 0, 0}};
		

		tester.makerow_col_zero(matrix);
		assertTrue(Arrays.deepEquals( matrix,zero_matrix ));



	}

}
