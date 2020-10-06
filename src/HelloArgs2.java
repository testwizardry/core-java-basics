public class HelloArgs2
{
	public static void main(String[] args)
	{
		System.out.println("number of args: " + args.length);
		
		String name;
		String lastName = null;
		
		if (args.length > 0)
		{
			name = args[0];
		}
		else 
		{
			name = "World";
		}
		
		System.out.println("Hello, " + name);
		
		if (args.length > 1)
		{
			lastName = args[1];
		}
		
		if (lastName != null)
		{
			System.out.println("Nice to meet you Mr. " + lastName);
		}
	}
}
