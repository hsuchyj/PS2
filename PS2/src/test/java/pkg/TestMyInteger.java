package pkg;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyInteger {
	
	@Test
	public void test() {
		MyInteger x = new MyInteger(5);
		MyInteger y = new MyInteger(6);
		
		assertEquals(x.getiValue(),5);
		assertEquals(x.isEven(),false);
		assertEquals(x.isOdd(),true);
		assertEquals(x.isPrime(),true);
		
		assertEquals(MyInteger.isEven(5),false);
		assertEquals(MyInteger.isOdd(5),true);
		assertEquals(MyInteger.isPrime(5),true);
		
		assertEquals(MyInteger.isEven(x),false);
		assertEquals(MyInteger.isOdd(x),true);
		assertEquals(MyInteger.isPrime(x),true);
		
		assertEquals(x.equals(5), true);
		assertEquals(x.equals(y), false);
		
		
		
		
		
	}

}

