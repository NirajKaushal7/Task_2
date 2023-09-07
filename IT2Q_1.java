// Q-1.How many male and female employees are there in the organization?			

import java.util.List;
import java.util.stream.Stream;
class IT2Q_1
{
	public static void hmMaleFemale(List<Employee> employeeList)
	{
	long totalMale = employeeList.stream().filter(x -> x.getGender().equals("Male")).count();	
	long totalFemale = employeeList.stream().filter(y -> y.getGender().equals("Female")).count();/*
	~Here by stream() we create a stream / copy of list
	~then filter(Predicate<T>) by this Stream.filter() the stream elements get filtered according our need means the elements who satisfies the condition only that will be present. 
	~count() is used to count the total elements present in Stream  its return type is double 
	*/	
	System.out.println(totalMale);
	System.out.println(totalFemale);
	
	}
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	hmMaleFemale(employeeList);
	}
}