package javademo;
import java.util.*;
public class ArrayDemo extends Display
{
	int b[] = new int[10];
	public static void main(String args [])
	{
		int [] a = {12,25,45,42};
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Print the Array Element place no and value of the possition := "+i+" "+a[i]);
		}
		Display d = new Display();
		d.sigleDarray();
		d.Displyarrayelement();
	}
}
 class Display
{
	 int b[] = new int[5];
	public void sigleDarray()
	{
		System.out.println("Enter the Single dimantional Array Element");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
			
		}
	}
	public void Displyarrayelement()
	{
		for(int i =0; i<b.length;i++)
		{
			System.out.println("Array possition and value of the possition :="+i+" "+b[i]);

		}
	}

}

