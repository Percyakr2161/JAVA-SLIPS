import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Order{

	String id,description;
}

class PurchaseOrder extends Order {

		String Customername,Vendorname;

		public void accept() throws IOException {
		
			System.out.println("Enter the id , description ,name of customer and vendors;");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			id = br.readLine();
			description = br.readLine();
			Customername = br.readLine();
			Vendorname = br.readLine();
		}
		public void display() {
		
			System.out.println("id:"+id);
			System.out.println("Description:"+description);
			System.out.println("Customername:"+Customername);
			System.out.println("Vendorname:"+Vendorname);
			System.out.println("--------");
		}
}
class SalesOrder extends Order{

	String Customername,Vendorname;
	public void accept() throws IOException {
		System.out.println("Enter the id, description,names of costomer and vendors:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		id = br.readLine();
		description = br.readLine();
		Customername = br.readLine();
		Vendorname = br.readLine();
	}
	public void display(){
		System.out.println("");
		System.out.println("Description: "+description);
                System.out.println("Customername: "+Customername);
                System.out.println("Vendorname: "+Vendorname);
                System.out.println("----------------------");

	}
}

class Main{
	public static void main(String[] args)throws IOException{

		int i;
		System.out.println("Select Any One:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("1.Purchase Order");
				System.out.println("2.Sales Order");
				int ch = Integer.parseInt(br.readLine());
				switch(ch) {

					case 1:
						System.out.println("Enter the number of purchase orders:");
						int n = Integer.parseInt(br.readLine());
						PurchaseOrder [] l = new PurchaseOrder[n];
						for(i=0;i<n;i++)
							{
								l[i] = new PurchaseOrder();
								l[i].accept();



							}
						for(i=0;i<n;i++)
							{
								l[i].display();
								System.out.println("Object are create");
							}
						break;
				
	                        	case 2:
				System.out.println("Ente rthe number of sales orders:");
				int m = Integer.parseInt(br.readLine());
				SalesOrder [] h = new SalesOrder[m];
				for(i=0;i<m;i++)
					{

					h[i] = new SalesOrder();
				h[i].accept();
					}
				for(i=0;i<m;i++)
					{
						h[i].display();
						System.out.println("Object created");
					}
				}


	}
}
