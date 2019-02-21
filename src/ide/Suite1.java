package ide;

import org.junit.Test;

import junit.framework.Assert;

public class Suite1 {

	@Test
	public void test1()
	{
		Skip.if_condition(false);
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test3");
	}

	@Test
	public void test3()
	{
		Skip.if_condition(3>4);
		System.out.println("test4");
	}

	@Test
	public void test4()
	{
		System.out.println("test5");
		Assert.assertEquals(true, false);
	}

	@Test
	public void test5()
	{
		System.out.println("test6");
	}

}
