package ide;

import org.junit.Test;


public class Airthematic {

	public int sum(int a, int b)
	{
		return a+b;
	}
	@Test
	public void hashing()
	{
		String str="Hello";
		Integer i=10;
		System.out.println(str.hashCode());
		System.out.println(i.hashCode());
	}
}
