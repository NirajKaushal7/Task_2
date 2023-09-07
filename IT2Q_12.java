// Q-12	What is the average salary and total salary of the whole organization?	
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
class IT2Q_12
{
	public static void avgSalTotalSal(List<Employee> employeeList)
	{
	OptionalDouble avgMale = employeeList.stream().mapToDouble(e->e.getSalary()).average();		
	if(avgMale.isPresent())
	{
	System.out.println(avgMale.getAsDouble());
	}
	else
	{
	System.out.println("No Record Found");
	}
	double totalSal = employeeList.stream().mapToDouble(e -> e.getSalary()).sum();
	System.out.println(totalSal);
	/*
	~Here by stream() we create a stream / copy of list
	~mapToDouble method to convert the Employee objects into a stream of double values (salaries) and then using sum() to compute the sum of all the salaries*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	avgSalTotalSal(employeeList);
	}
}