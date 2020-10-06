public class HelloArgs
{
	public static void main(String[] args)
	{
		System.out.println("number of args: " + args.length);
		
		String name;
		
		if (args.length > 0)
		{
			name = args[0];
		}
		else 
		{
			name = "World";
		}
		
		System.out.println("Hello, " + name);
	}
}
