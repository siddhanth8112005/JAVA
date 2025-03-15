import java.util.*;
class addnumbers
{
	static void fun()
		{
			System.out.println("I am insdie a function");
			System.out.println("My Program is working");
		}
				
		public static void main(String args[])
			{
				int a;
				int b;
				int c;
				
				Scanner sc =new Scanner(System.in);
				System.out.println("enter the firt number:");
				a=sc.nextInt();
				System.out.println("enter the second number:");				
				b=sc.nextInt();

				c=a+b;
	
				System.out.println("sum of numbers is="+c);
				 fun();
			}

		
}