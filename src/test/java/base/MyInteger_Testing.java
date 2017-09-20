package base;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Testing 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}
		static MyInteger var1 = new MyInteger(22);
		
		static MyInteger var2 = new MyInteger(11);
		
		static MyInteger var3 = new MyInteger(8);
		
		static MyInteger var4 = new MyInteger(3);
		
		@Test
		public void testIsEven() 
		{
			boolean expected1 = true;
			boolean actual1 = var1.isEven();
			assertEquals(expected1, actual1);
			
			boolean expected2 = false;
			boolean actual2 = var2.isEven();
			assertEquals(expected2, actual2);
			
			boolean expected3 = true;
			boolean actual3 = var3.isEven();
			assertEquals(expected3, actual3);
			
			boolean expected4 = false;
			boolean actual4 = var4.isEven();
			assertEquals(expected4, actual4);
			}
	@Before
	public void setUpBeforeClass1() throws Exception 
	{
		}
		
		static MyInteger value1 = new MyInteger(10);
		
		static MyInteger value2 = new MyInteger(5);
		
		static MyInteger value3 = new MyInteger(9);
		
		static MyInteger value4 = new MyInteger(4);
		
		@Test
		public void testIsOdd() 
		{
			boolean expected1 = false;
			boolean actual1 = value1.isOdd();
			assertEquals(expected1, actual1);
			
			boolean expected2 = true;
			boolean actual2 = value2.isOdd();
			assertEquals(expected2, actual2);
			
			boolean expected3 = true;
			boolean actual3 = value3.isOdd();
			assertEquals(expected3, actual3);
			
			boolean expected4 = false;
			boolean actual4 = value4.isOdd();
			assertEquals(expected4, actual4);
		}
		@Test
	public void isPrime() 
		{
		
		MyInteger a =new MyInteger(1);
		MyInteger b =new MyInteger(2);
		MyInteger c =new MyInteger(6);
		
		assertTrue(MyInteger.isPrime(a));
		assertTrue(MyInteger.isPrime(b));
		assertFalse(MyInteger.isPrime(c));
		}
}
