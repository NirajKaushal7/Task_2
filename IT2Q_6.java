// Q-6	Count the number of employees in each department?	
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
class IT2Q_6
{
	public static void No_OfEmpInEachDept(List<Employee> employeeList)
	{
	Map<String ,Long> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.counting()));	
	System.out.println(map);
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	and here in groupingBy() we pass in the first parameter group of department(keys) / the elements whose we want to create group and in second parameter we pass the counting() which count the no. of entries particular to department. 
	 
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	No_OfEmpInEachDept(employeeList);
	}
}