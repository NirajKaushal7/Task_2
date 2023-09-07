// Q-13	Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?			
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
class IT2Q_13
{
	public static void empYoungOld25(List<Employee> employeeList)
	{
	System.out.println("employees who are younger or equal to 25 years");	
	employeeList.stream().filter(e -> e.getAge() <= 25).forEach(System.out::println);	
	System.out.println("employees who are older than 25 years");	
	employeeList.stream().filter(e -> e.getAge() > 25).forEach(System.out::println);	
	/*
	~Here by stream() we create a stream / copy of list
	simply filter then traverse
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	empYoungOld25(employeeList);
	}
}