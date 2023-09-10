package com.task2.file;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.task2.entity.Student;

public class Taks_P_1Questions 
{

	public Taks_P_1Questions()
	{
		// TODO Auto-generated constructor stub
	}

//Q-1	
static List<Student>	 studentHavingPinCode(List<Student> studentList, List<Address> addressList, int pin_code)
{

//List<Address> newaddressList = 	addressList.stream().filter(a -> a.getPin_code() == pin_code).collect(Collectors.toList());

//here firstly took one student id and check it in all address id's then if id matches then we check the pin_code if condition satisfies then collect it.
	//but here many streams will create
List<Student> studentsOfPin_code = studentList.stream().filter(student -> addressList.stream().anyMatch(address -> address.getStudent_id() == student.getId() && address.getPin_code() == pin_code)).collect(Collectors.toList());

//another way
//here we firstly filter the address stream by pin_code and map that stream into its student_id and collect as list then we filter the student list by this student_id list.
 List<Integer> newList= addressList.stream().filter(a -> a.getPin_code() == pin_code ).map(Address::getStudent_id).collect(Collectors.toList());
 List<Student> studentsOfPin_codeX = studentList.stream().filter(student -> newList.contains(student.getId())).collect(Collectors.toList());
 
//If any filter is applied for example by gender then 
 List<Student> newStudentsOfPin_codeX = studentsOfPin_codeX.stream().filter(s -> s.getGender().equals("F")).collect(Collectors.toList());   

  
 
//return studentsOfPin_codeX;	
return newStudentsOfPin_codeX;
}

//Q-2
static List<Student>	 studentHavingCity(List<Student> studentList, List<Address> addressList, String  city)
{
List<Student> studentsOfCity= studentList.stream().filter(student -> addressList.stream().anyMatch(address -> address.getStudent_id() == student.getId() && address.getCity().equals(city))).collect(Collectors.toList());

List<Integer> newList= addressList.stream().filter(a -> a.getCity().equals(city)).map(Address::getStudent_id).collect(Collectors.toList());
 List<Student> studentsOfCityX = studentList.stream().filter(student -> newList.contains(student.getId())).collect(Collectors.toList());
//If any filter is applied for example by age then 
//List<Student> newStudentsOfCityX = studentsOfCityX.stream().filter(s -> s.getAge() > 20).collect(Collectors.toList());   

return studentsOfCityX;	
}

//Q-4
static List<Student>	 passedStudents(List<Student> studentList)
{
List<Student> passedStudents = studentList.stream().filter(student -> student.getMarks() >= 50).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newPassedStudents = passedStudents.stream().filter(s -> s.getAge() < 50).collect(Collectors.toList());   

return passedStudents;	
//return newPassedStudents;	
}

//Q-5
static List<Student>	 failedStudents(List<Student> studentList)
{
List<Student> failedStudents = studentList.stream().filter(student -> student.getMarks() < 50).collect(Collectors.toList());
//If any filter is applied for example by gender then 
//List<Student> newFailedStudents = failedStudents.stream().filter(s -> s.getGender().equals("M")).collect(Collectors.toList());   

return failedStudents;	

//return newFailedStudents;
}


//Q-6
static List<Student>	 studentHavingClass(List<Student> studentList, List<Class1> class1List, String  class1)
{
List<Integer> newList= class1List.stream().filter(c -> c.getName().equals(class1)).map(Class1::getId).collect(Collectors.toList());
List<Student> studentsOfClassX = studentList.stream().filter(student -> newList.contains(student.getClass_id())).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newStudentsOfClassX = studentsOfClassX.stream().filter(s -> s.getAge() < 45).collect(Collectors.toList());   

return studentsOfClassX;	
//return newStudentsOfClassX;	
}


//Q-7
static List<Student>	 failedStudentsByAge(List<Student> studentList)
{
List<Student> failedStudentsByAge = studentList.stream().filter(student -> student.getAge() < 20).collect(Collectors.toList());

//If any filter is applied for example by age then 
//List<Student> newFailedStudentsByAge = failedStudentsByAge.stream().filter(s -> s.getAge() < 35).collect(Collectors.toList()); 

return failedStudentsByAge;	
//return newFailedStudentsByAge;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentList  	= Csv.studentList;
		List<Address> addressList  = Csv.addressList;
		List<Class1> class1List = Csv.class1List;
		List<Student> updatedStudentList1 = studentHavingPinCode(studentList, addressList, 452002);
		System.out.println(updatedStudentList1);
		
		List<Student> updatedStudentList2 = studentHavingCity(studentList, addressList, "indore");
		//System.out.println(updatedStudentList2);
		
		List<Student> updatedStudentList4 = passedStudents(studentList);
		//System.out.println(updatedStudentList4);
		
		List<Student> updatedStudentList5 = failedStudents(studentList);
		//System.out.println(updatedStudentList5);
		
		List<Student> updatedStudentList6 = studentHavingClass(studentList, class1List, "A");
		//System.out.println(updatedStudentList6);

		
		
	}

}
