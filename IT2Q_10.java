// Q-10	What is the average salary of male and female employees?	
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
class IT2Q_10
{
	public static void maleFemaleInSMDept(List<Employee> employeeList)
	{
	Map<String ,Double> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.averagingDouble(e -> e.getSalary())));	
	System.out.println(map);
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	and here in groupingBy()  we pass in the first parameter group of gender(keys) / the elements whose we want to create group and in second parameter we pass the averagingDouble() corresponding to Salary which return average particular to gender. 
	 
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	maleFemaleInSMDept(employeeList);
	}
}




