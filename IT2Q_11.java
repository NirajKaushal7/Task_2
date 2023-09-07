// Q-11	List down the names of all employees in each department?	
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
class IT2Q_11
{
	public static void namesOfEmpInEachDept(List<Employee> employeeList)
	{
	// Map<String ,Double> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.averagingDouble(e -> e.getSalary())));	
	// System.out.println(map);
	
	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
            .forEach((department, empList) -> {
                System.out.println("Department: " + department);
                empList.stream()
                    .map(Employee::getName)
                    .forEach(System.out::println);
					System.out.println();
			});
			
		// Map<String,List<Employee>> a employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));//here data get grouped in specific department Hr[], Sales[] ... etc
		
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	~ here we group employees by their department using the Collectors.groupingBy collector. This results in a Map<String, List<Employee>> where the keys are department names, and the values are lists of employees in each department 
	and through forEach() we traverse firstly department and emplist contains all employee of specific dept so we traverse this list using map we create new stream of names and print them 
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	namesOfEmpInEachDept(employeeList);
	}
}