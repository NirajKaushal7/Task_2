// Q-5	Get the names of all employees who have joined after 2015?	
import java.util.List;
import java.util.HashSet;
class IT2Q_5
{
	public static void empJoinedAfter2015(List<Employee> employeeList)
	{
	employeeList.stream().filter(e -> e.getYearOfJoining()>2015).forEach(e -> System.out.println(e));
	/*
	~Here by stream() we create a stream / copy of list
	~then filter(Predicate<T>) by this Stream.filter() the stream elements get filtered according our need means the elements who satisfies the condition only that will be present. 
	~forEach() is used to to traverse the Stream.
	*/
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	empJoinedAfter2015(employeeList);
	}
}