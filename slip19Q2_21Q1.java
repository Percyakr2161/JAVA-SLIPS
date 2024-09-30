import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staff
{
	String name,address;
}

class FullTimeStaff extends Staff
{
	String department ;
	double salary;
	
	public void accept()throws IOException
		{
			System.out.println("Enter the name,department and salary:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			name = br.readLine();
			address= br.readLine();
			department = br.readLine();

			salary = Double.parseDouble(br.readLine());
		}
	public void display()
		{
			System.out.println("name:"+name);
			System.out.println("Address:"+address);
			System.out.println("Department:"+department);
			System.out.println("Salary:"+salary);
			System.out.println("---");

		}
}
class PartTimeStaff extends Staff
{
	int hours,rate;
	
	public void accept()throws IOException
		{
			System.out.println("Enter the name , address,no of working hours and rate per hours: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			name = br.readLine();
			address = br.readLine();
			hours = Integer.parseInt(br.readLine());
			rate = Integer.parseInt(br.readLine());
		}
	public void display()
		{
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("No of Working Hours: "+hours);
			System.out.println("Rate per hour: "+rate);
			System.out.println("----------------------");
		}
}
class stafftime
{
 public static void main(String[] args)throws IOException
	 {
	  int i;
	  System.out.println("select any one:");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	  System.out.println("1.Full Time Staff");
	  System.out.println("2.part time Staff");
	  int ch = Integer.parseInt(br.readLine());

	  switch(ch)
		  {
			  case 1:
				  System.out.println("Enter the number of full time staff:");
				  int n = Integer.parseInt(br.readLine());
				  FullTimeStaff [] l = new FullTimeStaff[n];
				  for(i=0;i<n;i++)
					  {
					   l[i] = new FullTimeStaff();
					   l[i].accept();
					  }
				  for(i=0;i<n;i++)
					  {
					   l[i].display();
					  }
				  break;

			  case 2:
				  System.out.println("Enter the number of part time staff:");
				  int m = Integer.parseInt(br.readLine());
				 PartTimeStaff [] h= new PartTimeStaff[m];
				 for(i=0;i<m;i++)
					 {
					  h[i] = new PartTimeStaff();
					  h[i].accept();
					 }
				 for(i=0;i<m;i++)
					 {
					  h[i].display();
					 }
				 break;


		  
		  }
	 }
}
