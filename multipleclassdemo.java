package javademo;
public class multipleclassdemo extends Car
{
	public static void main(String args[])
	{
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.putinput();
		c1.Printdetails();
	}

}
class Car
{
	int nofcar=0;
	String car_name;
	int car_year;
	String car_color;
	
	public void PrintCarDetails()
	{
		
		System.out.println("Car is ready to drive\n");
	}
	public void putinput()
	{
		System.out.println("Enter car detail by the user\n");
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter the Car Name\n");
		car_name = s.nextLine();
		System.out.println("Enter the Car Modal\n");
		car_year = s.nextInt();
		String car_name = s.nextLine();
		System.out.println("Enter the Car color\n");
		car_color = s.nextLine();
	}
	
	public void Printdetails()
	{
		System.out.println("Car is ready, details given :-");
		System.out.println("Car Name is :"+car_name);
		System.out.println("Car modal year name is :"+car_year);
		System.out.println("Car Color Name is :"+car_color);
}
	
}