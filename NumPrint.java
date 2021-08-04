class A
{
	public void numPrint()
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%3 != 0)
			System.out.println(i);
		}

	}

	public static void main(String args[])
	{
		A a=new A();
		a.numPrint();
	}

}