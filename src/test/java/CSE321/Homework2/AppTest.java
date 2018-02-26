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
		System.out.println("Test Add Run");
		assertEquals(4, App.add(a, b));
	}

	@Test
	public void TestSub(){
		System.out.println("Test Sub Run");
		assertEquals(0,App.subtract(a, b));
	}

	@Test
	public void TestDiv(){
		System.out.println("Test Div Run");
		assertEquals(1,App.divide(a,b));
	}
}
