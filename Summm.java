import java.util.Scanner; 
public class Summm{
	public static void main(String[]args)
{
	int x,y,sum;
	Scanner sc=new Scanner(System.in);
    System.out.println("enter value of x: ");
    x=sc.nextInt();
    System.out.println("enter value of y: ");
    y=sc.nextInt();
sc.close();
    sum=x+y;
    System.out.println("sum of two number x and y is: "+sum);
}
}