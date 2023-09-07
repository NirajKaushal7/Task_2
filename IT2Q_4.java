// Q-4	Get the details of highest paid employee in the organization?	
import java.util.List;
import java.util.HashSet;
import java.util.Optional;
import java.util.Comparator;
class IT2Q_4
{
	public static void higestPaidEmployee(List<Employee> employeeList)
	{
		
Optional<Employee> higestPaidEmployee =	employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));	
/*
	~Here by stream() we create a stream / copy of list
	~Comparator.comparingDouble(Employee::getSalary) This creates a comparator for comparing Employee objects based on their salaries.
	~comparingDouble(Function<T,R>) and here we use method reference and salaries in double type thats why we use comparingDouble() 
	~max(Comparator) used to find the employee whose salary is max. 
	*/

if(higestPaidEmployee.isPresent())
{
Employee e = higestPaidEmployee.get();
System.out.println(e);
}
else
{
System.out.println("No record Found");
}
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	higestPaidEmployee(employeeList);
	}
}