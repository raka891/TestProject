class A
{

	public static void main(String args[])
	{
		String str=args[0];
		int startIndex;
		int endIndex;

		if(args.length==1)
		{
			System.out.println(str);
		}


		if(args.length==2)
		{
			
			startIndex=Integer.parseInt(args[1]);
			String str1=str.substring(0,startIndex);
			System.out.println(str1);
		}

		if(args.length==3)
		{
			startIndex=Integer.parseInt(args[1]);
			endIndex=Integer.parseInt(args[2]);
			String str1=str.substring(startIndex-1,endIndex-1);
			System.out.println(str1);
		}



	}


}