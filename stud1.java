/*8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects */

class Stud
{
	int arr[];
	stud(string name,int age,string address)
	{
	System.out.println("name:"+name+ "age:"+age+ "address"+address);
	}
}
class public stud1
{
	public static void main(String args[])
	{
	int arr[]={"tom",23,"pune"};
	Stud s=new Stud(arr);
	}
}