// Q-14	Who is the oldest employee in the organization? What is his age and which department he belongs to?		
import java.util.List;
import java.util.HashSet;
import java.util.Optional;
import java.util.Comparator;
class IT2Q_14
{
	public static void oldestEmployee(List<Employee> employeeList)
	{
		
Optional<Employee> higestPaidEmployee =	employeeList.stream().min(Comparator.comparingDouble(Employee::getYearOfJoining));	
/*
	~Here by stream() we create a stream / copy of list
	~min(Comparator) used to find the employee whose yearOfJoining is min. 
	*/

if(higestPaidEmployee.isPresent())
{
Employee e = higestPaidEmployee.get();
System.out.println("Name = "+e.getName()+"\tAge = "+e.getAge()+"\tDepartment = "+e.getDepartment());
}
else
{
System.out.println("No record Found");
}
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	oldestEmployee(employeeList);
	}
}