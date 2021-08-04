import java.util.Scanner;

class swapnum
{

	public static void main(String []args)
	{
		System.out.println("Enter the first number num1 =");
		Scanner	Inp=new Scanner(System.in);
		int num1=Inp.nextInt();	

		
		System.out.println("Enter the Second number num2 =");
		int num2=Inp.nextInt();

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		System.out.println("num1=:: "+num1+ "  and  num2=:: " +num2);


	
	}



}