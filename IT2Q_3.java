// Q-3	What is the average age of male and female employees?	
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.OptionalDouble;
class IT2Q_3
{
	public static void avgAgeMaleFemale(List<Employee> employeeList)
	{
	OptionalDouble avgMale = employeeList.stream().filter(e->e.getGender().equals("Male")).mapToInt(e->e.getAge()).average();	
	OptionalDouble avgFemale = employeeList.stream().filter(e->e.getGender().equals("Female")).mapToInt(e->e.getAge()).average();	
	/*
	~Here by stream() we create a stream / copy of list
	~then filter(Predicate<T>) by this Stream.filter() the stream elements get filtered according our need means the elements who satisfies the condition only that will be present. 
	~mapToInt() is used to return IntStream and its elements are the returned value of Funtion<T,R> 
	~average() return the average return type OptionalDouble means it will be empty in some input and also return value its optional according to test cases.
	*/
	try{
	System.out.println(avgMale.getAsDouble());
	System.out.println(avgFemale.getAsDouble());
	}
	catch(NoSuchElementException e){
	System.out.println("No data available");
	}

	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	avgAgeMaleFemale(employeeList);
	}
}