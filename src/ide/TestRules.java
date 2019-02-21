package ide;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestRules {
	@Rule
	public  Retry retry=new Retry(3);
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Inside Before Class");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Inside After Class");
	}
	@Before
	public void beforeMethod()
	{
		System.out.println("Inside Before Method");
	}
	@After
	public void afterMethod()
	{
		System.out.println("Inside After Method");
	}
	@Rule
	public TestRule listener=new TestWatcher(){
		//Lambda expressions	
		@Override
		public void failed(Throwable e, Description desc)
		{
			System.out.println("The test case failed with method name "+desc.getMethodName()+"and Eception is "+e);
		}
		@Override
		public void succeeded(Description desc)
		{
			System.out.println("The  test case pass with method name "+desc.getMethodName());
		}
		};
	}

