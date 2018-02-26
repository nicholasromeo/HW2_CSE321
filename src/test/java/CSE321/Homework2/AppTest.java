package CSE321.Homework2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private int a;
	private int b;

	@Before
	public void TestSetUp() {
		a = 2;
		b = 2;
	}

	@Test
	public void TestAdd(){
		assertEquals(4, App.add(a, b));
	}

	@Test
	public void TestSub(){
		assertEquals(0,App.subtract(a, b));
	}

	@Test
	public void TestDiv(){
		assertEquals(1,App.divide(a,b));
	}
}
