class Employee
{
	String type="employee";
	Employee()
	{
	System.out.println("This is an Employee");
        }
}
class Faculty extends Employee
{
	String type="faculty";
	Faculty()
	{
		System.out.println("This is an Faculty");
	}
}
class HOD extends Faculty
{
	String type="hod";
	HOD()
	{
		System.out.println("This is an HOD");
	}
}
public class MultilevelDemo
{

	public static void main(String[] args)
	{
		HOD ob=new HOD();

	}
}

