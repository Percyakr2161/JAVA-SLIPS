class InvalidUsernameException extends Exception
{
	public InvalidUsernameException()
	{
		System.out.println("Invalid Username");
	}
}

class InvalidPasswordException extends Exception
{
	public InvalidPasswordException()
	{
		System.out.println("Invalid Password");
	}
}
class EmailId
{
	String uname,pwd;
	public EmailId()
	{
		uname="";
		pwd="";
	}
	public EmailId(String uname,String pwd)
	{
		this.uname=uname;
		this.pwd=pwd;
	}
	public static void main(String[] args)
	{
		String uname,pwd;
		uname=args[0];
		pwd=args[1];
		EmailId ob=new EmailId(uname,pwd);
		try
		{
			if(("preranasherla").equals(ob.uname))
				System.out.println("Valid Username");
			else
				throw new InvalidUsernameException();
		}
		catch(InvalidUsernameExce


	}
}
