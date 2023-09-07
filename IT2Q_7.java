// Q-7	What is the average salary of each department?	
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
class IT2Q_7
{
	public static void avgSalOfEachDept(List<Employee> employeeList)
	{
	Map<String ,Double> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.averagingDouble(e -> e.getSalary())));	
	System.out.println(map);
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	and here in groupingBy()  we pass in the first parameter group of department(keys) / the elements whose we want to create group and in second parameter we pass the averagingDouble() corresponding to Salary which return average particular to department. 
	 
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	avgSalOfEachDept(employeeList);
	}
}