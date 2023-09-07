// Q-8	Get the details of youngest male employee in the product development department?	
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;
class IT2Q_8
{
	public static void yongestMaleInPD_Dept(List<Employee> employeeList)
	{
Optional<Employee>  yongestMale = employeeList.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).min(Comparator.comparingDouble(Employee::getAge));	
	if(yongestMale.isPresent())
	{
	Employee ee = yongestMale.get();	
	System.out.println(ee);
	}
	else
	{
	System.out.println("Data not Found");
	}
	/*
	~Here by stream() we create a stream / copy of list
	~min(Comparator) here we pass comparator which return Optional of Employee containing min value corresponding to Age 
	*/
	
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	yongestMaleInPD_Dept(employeeList);
	}
}