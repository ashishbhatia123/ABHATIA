package com.capgemini.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;



	public class userExceptionTest {

		@Test(expected = nameException.class)
		public void test() throws nameException {
			userException obj =new userException("", "");
			/*try
			{
			obj.method();
			}
			catch(nameException e)
			{
				System.out.println(e.getMessage());
			}*/
			
			obj.method();
		}
		@Test
		public void test1() throws nameException {
			userException obj =new userException("asdsd", "sdsds");
			/*try
			{
			obj.method();
			}
			catch(nameException e)
			{
				System.out.println(e.getMessage());
			}*/
			
			assertEquals("full name is correct",obj.method());
		}
		
}
