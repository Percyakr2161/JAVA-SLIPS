`import java.util.Scanner;

class Product implements Cloneable {
		
	int pid;
	String pname;
	double pcost;
	

	public Product(int pid,String pname,double pcost)
		{
			this.pid = pid;
			this.pname = pname;
			this.pcost = pcost;
		
		}

	public void showDetail()
		{
		 System.out.println("Product Id:"+pid);
		 System.out.println("Product name:"+pname);
		 System.out.println("Product cost:"+pcost);
		}

	      protected Object clone() throws CloneNotSupportedException {
        return super.clone();
	      }

	public static void main(String[] args)
		{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter product id:");
		 int pid = sc.nextInt();

		 System.out.println("Enter product name:");
		 String pname = sc.next();

		 System.out.println("Enter Product cost:");
		 double pcost = sc.nextDouble();

		 System.out.println("---Product Details---");
		 Product p1 = new Product(pid,pname,pcost);

		 try {

		 Product p2 = (Product) p1.clone();
		 p2.showDetail();
		
		 }
		  catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
	sc.close();
		}
	

}
