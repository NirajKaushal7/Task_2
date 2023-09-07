// Q-2	Print the name of all departments in the organization?	
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
class IT2Q_2
{
	public static void allDepartment(List<Employee> employeeList)
	{	
	Set<String> set = employeeList.stream().map(x -> x.getDepartment()).collect(Collectors.toSet());
		System.out.println(set);
/*
	~Here by stream() we create a stream / copy of list
	map() convert the stream into the the value which is return by Function<T,R> which is paased in it
	collect(Collectors.toSet()) is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	*/
		
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	allDepartment(employeeList);
	}
}