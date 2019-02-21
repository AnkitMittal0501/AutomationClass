package ide;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {

	@Before
	public void before()
	{
		System.out.println("Inside Before");
	}
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void aftreclass()
	{
		System.out.println("after Class");
	}
	@After
	public void after()
	{
		System.out.println("Inside After");
	}
	
	@Test
	@Ignore
	public void test()
	{
		System.out.println("Inside Test");
	}
}  
