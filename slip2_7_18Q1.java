import java.util.Scanner;

class Employee {

	int id;
	String name;
	String deptname;
	float salary;
	static int numberofobjects = 0;

	Employee() {

		id = 0;
		name = "";
		deptname = "";
		salary = 0;
	}

	Employee(int id ,String name, String deptname,float salary) {
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
		numberofobjects++;
	}
	public void display(){

		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee department:"+deptname);
		System.out.println("Employee Salary :"+salary);
	}
	public static void main(String[] args){

		int n = 0,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employee you want to enter :");
		n = sc.nextInt();
		Employee[] ob = new Employee[n];

		for(i=0;i<n;i++){
			sc = new Scanner(System.in);
				System.out.println("Enter id of employee "+(i+1)+":");
			int id = sc.nextInt();
			System.out.println("Enter Name of employee "+(i+1)+" :");
			sc.nextLine();

			String name = sc.nextLine();
			System.out.println("Enter dept name of employee"+(i+1)+":");

			String deptname = sc.nextLine();
			System.out.println("Enter salary of employee "+(i+1)+":");

			float salary = sc.nextFloat();
			ob[i] = new Employee(id,name,deptname,salary);

			System.out.println("\n Number of objects:"+numberofobjects);
		}
		for(i=0;i<n;i++) {

			ob[i].display();
		
		}

	}
}
