interface Operation
{
	double pi = 3.142;
	double area();
	double volume();
}
class Cylinder implements Operation
{
	double radius;
	double height;

	public Cylinder(double radius ,double height)
		{
			this.radius = radius;
			this.height = height;
		}
	public double area()
		{
			return 2 * pi * radius *(radius + height);
		}
	public double volume()
		{
			return pi * radius * radius * height;
		}
}
class Main
{

		public static void main(String[] args)
			{
				Cylinder cy = new Cylinder(5,10);

				System.out.println("Area of Cylinder:"+cy.area());
				System.out.println("volume of Cylinder"+cy.volume());
			}
	}

