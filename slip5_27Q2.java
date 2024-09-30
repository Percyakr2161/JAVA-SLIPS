import java.awt.*;
import java.awt.event.*;

class InvalidPasswordException extends Exception
{
  InvalidPasswordException()
	  {
	   System.out.println("User name and password is not same");

	  }
}
 class PasswordDemo extends Frame implements ActionListener
{
 Label uname,upass;
 TextField nametext, passtext,msg;
 Button login,Clear;
 Panel p;
 int attempt = 0;
 char c ='*';

 public void login()
	 {
	  p =new Panel();
	  uname = new Label("user name :",Label.CENTER);
	  upass = new Label("password:",Label.RIGHT);

	  nametext = new TextField(20);
	  passtext = new TextField(20);
	  passtext.setEchoChar(c);
	  msg = new TextField(10);
	  msg.setEditable(false);

	  login = new Button("login");
	  Clear = new Button("Clear");
	  login.addActionListener(this);
	  Clear.addActionListener(this);

	  p.add(uname);
	  p.add(nametext);
	  p.add(upass);
	  p.add(passtext);
	  p.add(login);
	  p.add(Clear);
	  p.add(msg);

	  add(p);

	  setTitle("Login");
	  setSize(290,200);
	  setResizable(false);

	  setVisible(true);
	 }
 public void actionPerformed(ActionEvent ae)
	 {
	  Button btn = (Button)(ae.getSource());

	  if(attempt<3)
		  {
		   if((btn.getLabel())=="Clear")
			   {
			    nametext.setText("");
			    passtext.setText("");
			   }
		   if((btn.getLabel())=="Login")
			   {
			    try
				    {
				    String user = nametext.getText();
				    String upass = passtext.getText();
				    if(user.compareTo(upass)==0)
					    {
					     msg.setText("valid");
					     System.out.println("Username is valid");

					    }
				    else
					    {
					    throw new InvalidPasswordException();

					    }
				    }
			    catch(InvalidPasswordException e)
				    {
				     msg.setText("Error");
				    }
			    attempt++;

			   }
		  }
	  else
		  {
		   System.out.println("you are using 3 attemplt");
		   System.exit(0);
		  }
	 }
 public static void main(String[] args)
	 {
	  PasswordDemo pd = new PasswordDemo();
	  pd.login();
	 }
}
