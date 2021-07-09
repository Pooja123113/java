import java.util.Scanner;
public class kelvin
{
	public static void main(String[]args)
{
	double frh,kel;
	Scanner Scanner;
	Scanner=new Scanner(System.in);
	System.out.println("enter temperature in kelvin: ");
	kel=Scanner.nextDouble();
	frh=(9.0/5)*(kel-273.15)+32;
	System.out.println("the temp in celcius is: "+frh);
}
}
	 