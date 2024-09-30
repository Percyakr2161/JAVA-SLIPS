import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MouseEvents extends JFrame implements MouseListener,MouseMotionListener
{ 

	String str = "";
	JTextArea ta;
	Container c;
	int x,y;
	

	MouseEvents() { 
	
		c= getContentPane();
		c.setLayout(new FlowLayout());;

		ta = new JTextArea("CLick the mouse or move it",5,20);
		ta.setFont(new Font("Arial",Font.BOLD,30));
		c.add(ta);
		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)

		{ 
		
			int i = me.getButton();
			if(i==1)
				str+= "clicked Button:left";
			else if(i==2)
				str+="clicked Button:middle";
			else if(i==3)
				str+="clicked button:right";
			this.display();
		}

	public void mouseEntered(MouseEvent me)
		{ 
		
			str+="mouse Entered";
			this.display();
		}

	public void mouseExited(MouseEvent me)
		{ 
		
			str+="mouse Exited";
		        this.display();
		}

	public void mousePressed(MouseEvent me)
		{ 
		
			x = me.getX();
			y = me.getY();
			str+= "Mouse Pressed at:"+x+"\t"+y;
			this.display();
		}


	public void mouseReleased(MouseEvent me)
		{ 
		
			x = me.getX();
			y = me.getY();
			str+= "MouseReleased at:"+x+"\t"+y;
			this.display();
		}

	public void mouseDragged(MouseEvent me)
		{ 
			
			x = me.getX();
			y = me.getY();
			str+="MouseDregged at:"+x+"\t"+y;
			this.display();
		}

	public void mouseMoved(MouseEvent me)
		{ 
		
			x = me.getX();
			y = me.getY();
			str+="MouseMoved at:"+x+"\t"+y;
			this.display();
		}

	public void display()
		{ 
			
			ta.setText(str);
			str="";
		}

	public static void main(String[] args)
		{ 
			
			MouseEvents mes = new MouseEvents();
			mes.setSize(400,400);
			mes.setVisible(true);
			mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
