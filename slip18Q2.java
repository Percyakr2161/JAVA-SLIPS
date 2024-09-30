import java.io.*;

class CovidException extends Exception
{
	public CovidException()
		{
			System.out.println("Patient is covid positive and needs to be hospitalized ");
		}
}

class Patient
{
	String name;
	int age;
	double level,hrct;

	public Patient(String name,int age,double level,double hrct)
		{
			this.name = name;
			this.age = age;
			this.level = level;
			this.hrct = hrct;

		}
	public static void main(String[] args)throws IOException
		{
			String name;
			int age;
			double level,hrct;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name:");
			name = br.readLine();

			System.out.println("Enter age:");
			age = Integer.parseInt(br.readLine());

			System.out.println("oxygen level:");
			level = Double.parseDouble(br.readLine());

			System.out.println("HRCT report:");
			hrct = Double.parseDouble(br.readLine());

			Patient ob = new Patient(name,age,level,hrct);

			try
				{
					if(ob.level < 95 && ob.hrct > 10)
						throw new CovidException();
					else
						{
							System.out.println("Patient Info:");
							System.out.println("Name:"+ob.name);
							System.out.println("Age:"+ob.age);
							System.out.println("Oxygen Level:"+ob.level);
							System.out.println("HRCT report :"+ob.hrct);
						}
				}
			catch(CovidException e)
				{
					System.out.println(e.getMessage());

				}
		}
}
