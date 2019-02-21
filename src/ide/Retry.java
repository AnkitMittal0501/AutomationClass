package ide;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Retry implements TestRule {
	int count;

	public Retry(int count) {
		this.count = count;
	}

	@Override
	public Statement apply(Statement base, Description desc) {
		// TODO Auto-generated method stub
		return statement(base,desc);
	}
	private Statement statement(Statement base, Description desc)
	{
		return new Statement(){

			@Override
			public void evaluate() throws Throwable {
				Throwable throwable=null;
				for(int i=0;i<count;i++)
				{
					try{
						base.evaluate();
						return;
					}
					catch(Exception e)
					{
						throwable=e;
						System.out.println("Attempt fail "+(i+1)+ " times");
						System.out.println(throwable);
					}
				}
				System.out.println("Attempt failed "+count);
				throw throwable;
				
			}
			
		};
	}

}
