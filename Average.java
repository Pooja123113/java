import java.util.Scanner;
public class Average{
	public static void main(String[]args)
{
	Double a,b,c,d,total,avg;
	Scanner Scanner;
	Scanner=new Scanner(System.in);
	System.out.println("enter the first number: ");
	a=Scanner.nextDouble();
	System.out.println("enter the second number: ");
	b=Scanner.nextDouble();
	System.out.println("enter the third number: ");
	c=Scanner.nextDouble();
	System.out.println("enter the fourth number: ");
	d=Scanner.nextDouble();
	total=a+b+c+d;
	avg=total/4;
	System.out.println("total: "+total);
	System.out.println("average: "+avg);
}
}