class helloWorld
{
	public void display(String username)
	{

		System.out.println("HelloWorld" +" " + username);
	
	}

	public static void main(String[] args)
	{
		helloWorld A=new helloWorld();
		A.display(args[0]);
	
	}
}
