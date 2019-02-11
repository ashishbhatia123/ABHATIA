package com.capgemini.junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaTestFile {
	Java obj = new Java();
	@Test
	void test() {
		
		int x=obj.Squares(4);
		assertEquals(16,x);
	}
	@Test
void Test1() {
		assertEquals(7,obj.max(new int[] {1,2,3,5,7,4,3,2,1}));
		assertEquals(0,obj.max(new int[] {-1,-2,-3,-5,-7,-4,-3,-2,-1}));
	}
}
