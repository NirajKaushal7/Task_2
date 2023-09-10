import java.util.*;
import java.util.stream.*;

class Task2_P_2_AllQue
{
	//1.
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
	
	//2.
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
	
	//3.
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
	
	//4.
	public static void higestPaidEmployee(List<Employee> employeeList)
	{
	Optional<Employee> higestPaidEmployee =	employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));	
	/*
	~Here by stream() we create a stream / copy of list
	~Comparator.comparingDouble(Employee::getSalary) This creates a comparator for comparing Employee objects based on their salaries.
	~comparingDouble(Function<T,R>) and here we use method reference and salaries in double type thats why we use comparingDouble() 
	~max(Comparator) used to find the employee whose salary is max. 
	*/

	if(higestPaidEmployee.isPresent())
	{
	Employee e = higestPaidEmployee.get();
	System.out.println(e);
	}
	else
	{
	System.out.println("No record Found");
	}
	}
	
	//5.
	public static void empJoinedAfter2015(List<Employee> employeeList)
	{
	employeeList.stream().filter(e -> e.getYearOfJoining()>2015).forEach(e -> System.out.println(e));
	/*
	~Here by stream() we create a stream / copy of list
	~then filter(Predicate<T>) by this Stream.filter() the stream elements get filtered according our need means the elements who satisfies the condition only that will be present. 
	~forEach() is used to to traverse the Stream.
	*/
	}
	
	//6.
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
	
	//7.
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
	
	//8.
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
	
	//9.
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
	
	//10.
	public static void avgSalaryOfMaleFemale(List<Employee> employeeList)
	{
	Map<String ,Double> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.averagingDouble(e -> e.getSalary())));	
	System.out.println(map);
	/*
	~Here by stream() we create a stream / copy of list
	~collect() is used to convert the Stream into Set or it collects the elements of the stream into a new data structure
	and here in groupingBy()  we pass in the first parameter group of gender(keys) / the elements whose we want to create group and in second parameter we pass the averagingDouble() corresponding to Salary which return average particular to gender. 
	 
	*/
	}

	//11.
	public static void namesOfEmpInEachDept(List<Employee> employeeList)
	{

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

	//12.
	public static void avgSalTotalSal(List<Employee> employeeList)
	{
	OptionalDouble avgMale = employeeList.stream().mapToDouble(e->e.getSalary()).average();		
	if(avgMale.isPresent())
	{
	System.out.println(avgMale.getAsDouble());
	}
	else
	{
	System.out.println("No Record Found");
	}
	double totalSal = employeeList.stream().mapToDouble(e -> e.getSalary()).sum();
	System.out.println(totalSal);
	/*
	~Here by stream() we create a stream / copy of list
	~mapToDouble method to convert the Employee objects into a stream of double values (salaries) and then using sum() to compute the sum of all the salaries*/
	}
	
	//13.
	public static void empYoungOld25(List<Employee> employeeList)
	{
	System.out.println("employees who are younger or equal to 25 years");	
	employeeList.stream().filter(e -> e.getAge() <= 25).forEach(System.out::println);	
	System.out.println("employees who are older than 25 years");	
	employeeList.stream().filter(e -> e.getAge() > 25).forEach(System.out::println);	
	/*
	~Here by stream() we create a stream / copy of list
	simply filter then traverse
	*/
	}
	
	//14.
	public static void oldestEmployee(List<Employee> employeeList)
	{

	Optional<Employee> oldestdEmployee = employeeList.stream().min(Comparator.comparingDouble(Employee::getYearOfJoining));	
	/*
	~Here by stream() we create a stream / copy of list
	~min(Comparator) used to find the employee whose yearOfJoining is min. 
	*/

	if(oldestdEmployee.isPresent())
	{
	Employee e = oldestdEmployee.get();
	System.out.println("Name = "+e.getName()+"\tAge = "+e.getAge()+"\tDepartment = "+e.getDepartment());
	}
	else
	{
	System.out.println("No record Found");
	}
	}

	
	public static void main(String ar[])
	{
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	
	hmMaleFemale(employeeList);
	
	allDepartment(employeeList);
	
	avgAgeMaleFemale(employeeList);
	
	higestPaidEmployee(employeeList);
	
	empJoinedAfter2015(employeeList);
	
	No_OfEmpInEachDept(employeeList);
	
	avgSalOfEachDept(employeeList);
	
	yongestMaleInPD_Dept(employeeList);
	
	maleFemaleInSMDept(employeeList);
	
	avgSalaryOfMaleFemale(employeeList);
	
	namesOfEmpInEachDept(employeeList);
	
	avgSalTotalSal(employeeList);
	
	empYoungOld25(employeeList);
	
	oldestEmployee(employeeList);
	
	}
}