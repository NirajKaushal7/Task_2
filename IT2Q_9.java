// Q-9	How many male and female employees are there in the sales and marketing team?	
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
class IT2Q_9
{
	public static void maleFemaleInSMDept(List<Employee> employeeList)
	{
Map<String,Long>  maleFemale = employeeList.stream().filter(e -> e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));	
	
	System.out.println(maleFemale);
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	and here in groupingBy()  we pass in the first parameter group of department(keys) / the elements whose we want to create group and in second parameter we pass the counting() which count the no. of entries particular to department. 
	 
	*/
	
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	maleFemaleInSMDept(employeeList);
	}
}