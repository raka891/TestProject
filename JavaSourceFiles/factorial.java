class factorial
{

	public void calculateFactorial(int num)
	{
		int fact=1;
		//for(int i=num;i>=1;i--)
		while(num>1)
		{
			fact=num*fact;
			
			num=num-1;
			
		}
		

		//return fact;
		System.out.println(fact);
	}

	public static void main(String []args)
	{
	
		int num=Integer.parseInt(args[0]);
		factorial f=new factorial();
		f.calculateFactorial(num);
		//System.out.println(finfact);

	

	}
}
