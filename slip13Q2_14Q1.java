import java.util.Scanner;

class Operation
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			int choice;

			do
				{
					System.out.println("1.Calculate the volume of a cylinde");
					System.out.println("2.Find the factorial of a given number :");
					System.out.println("3.Check if the number is armstring or not  ");
					System.out.println("4.EXIT");

					choice = sc.nextInt();

					switch(choice)
						{
							case 1:
								calCylinderVolume();
								break;

							case 2:
								findFactorial();
								break;

							case 3:
								checkArmstrong();
								break;

							case 4:
								System.out.println("Exiting the program ");
								break;
						}
					System.out.println();
				}
			while(choice !=4);
		}
	public static void calCylinderVolume()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius of the cylinder:");
			double r =sc.nextDouble();
			System.out.println("Enter height of the cylinder:");
			double h = sc.nextDouble();

			double volume = 3.14F *(r * r) *h;
			System.out.println("The volume of the cylinder is :"+volume);
		}

	public static void findFactorial()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number :");
			int num = sc.nextInt();
			long fact =1;
			for(int i=1;i<=num;i++)
				{
					fact *=i;
				}
			System.out.println("the factorial of"+num+"is:"+fact);
		}
	public static void checkArmstrong()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number:");
			int num = sc.nextInt();


			int temp,d=0,compare=num;

			while(num>0)
				{
					temp = num%10;
					d += (temp*temp*temp);
					num  = num/10;
				}
			if(d == compare)
				{
					System.out.println("is an Armstrong number.");

				}
			else
				{
					System.out.println("in not an Armstrong number:");
				}
		}
}
