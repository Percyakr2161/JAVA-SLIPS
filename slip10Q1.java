import java.util.*;
class Person
{
	String fname,mname,lname;
	int len;

	void accept()
		{
			System.out.println("Enter first name:");
			Scanner s = new Scanner(System.in);
			fname = s.next();

			System.out.println("Enter middle name:");
			mname = s.next();

			System.out.println("Enter last name:");
			lname = s.next();

			len = mname.length();

			String f = mname.substring(0,1);
			String l = mname.substring(1,len);
			f = f.toUpperCase();
			mname = f+l;
		}
	void display()
		{
			System.out.println("Last name:"+lname);
			System.out.println("first name:"+fname);
			System.out.println("middle name :"+mname);

		}
	public static void main(String[] args)
		{
			Person p =new Person();
			p.accept();
			p.display();
		}
}

