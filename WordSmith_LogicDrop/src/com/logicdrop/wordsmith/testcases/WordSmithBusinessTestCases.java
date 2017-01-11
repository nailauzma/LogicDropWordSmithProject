package com.logicdrop.wordsmith.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.logicdrop.wordsmith.WordSmithBusiness;

public class WordSmithBusinessTestCases {
	WordSmithBusiness wst=new WordSmithBusiness();

		
	@Test
	public void testCheckForResult_Word_WithNumberMultiplesOf3() {
		int number=3;
		String expectedResult="word";
		String actualResult=wst.checkForResult(number);
			assertEquals(expectedResult,actualResult);
		}
	@Test
	public void testCheckForResult_Word_WithNumberMultiplesOf5() {
		int number=5;
		String expectedResult="smith";
			String actualResult=wst.checkForResult(number);
			assertEquals(expectedResult,actualResult);			
	}
	@Test
	public void testCheckForResult_Word_WithNumberMultiplesOf15() {
		int number=15;
		String expectedResult="wordsmith";
		String actualResult=wst.checkForResult(number);
		assertEquals(expectedResult,actualResult);
		
	}
	@Test
	public void testCheckForResult_Word_WithNumberNonMultiplesOf3_5_15(){
		int number=2;
		String expectedResult="2";
		String actualResult=wst.checkForResult(number);
		assertEquals(expectedResult,actualResult);			
	}


}
