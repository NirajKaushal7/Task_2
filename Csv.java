


package com.task2.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.task2.entity.Student;

public class Csv 
{
	static List<Student> studentList  	= new ArrayList<>();
	static List<Address> addressList  = new ArrayList<>();
	static List<Class1> class1List = new ArrayList<>();
	
	 static String studentFile = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Student.csv";
     static String addressFile = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Address.csv";
     static String class1File = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Class.csv";

	static 
	{
		uploadStudent(studentFile);
        uploadAddress(addressFile);
        uploadClass1(class1File);	
	}
     
	public static void uploadStudent(String file )
	{
try (BufferedReader br = new BufferedReader(new FileReader(file))) 
{
    String line;
    boolean isFirstLine = true; 

    while ((line = br.readLine()) != null) 
    {
        if (isFirstLine) {
            isFirstLine = false;
            continue;
        }

        String[] data = line.split(","); 

        //if (data.length == 6) 
        //{ 
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int classId = Integer.parseInt(data[2]);
            int marks = Integer.parseInt(data[3]);
            String gender = data[4];
            int age = Integer.parseInt(data[5]);

            Student student = new Student(id, name, classId, marks, gender, age);
           // System.out.println(student);
            studentList.add(student);
      //  }
    }
} catch (IOException e) {
    e.printStackTrace();
}
	}

	
	public static void uploadAddress(String file )
	{


try (BufferedReader br = new BufferedReader(new FileReader(file))) 
{
    String line;
    boolean isFirstLine = true; 

    while ((line = br.readLine()) != null) 
    {
        if (isFirstLine) {
            isFirstLine = false;
            continue;
        }

        String[] data = line.split(","); 

        //if (data.length == 4) 
       // { 
            int id = Integer.parseInt(data[0]);
            int pin_code = Integer.parseInt(data[1]);
              String city = data[2];
            int student_id = Integer.parseInt(data[3]);

            Address address= new Address(id, pin_code, city, student_id);
            addressList.add(address);
       // }
    }
} catch (IOException e) {
    e.printStackTrace();
}
	}

	
	public static void uploadClass1(String file)
	{

try (BufferedReader br = new BufferedReader(new FileReader(file))) 
{
    String line;
    boolean isFirstLine = true; 

    while ((line = br.readLine()) != null) 
    {
        if (isFirstLine) {
            isFirstLine = false;
            continue;
        }

        String[] data = line.split(","); 

       // if (data.length == 2) 
        //{ 
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            Class1 class1= new Class1(id, name);
            class1List.add(class1);
        //}
    }
} catch (IOException e) {
    e.printStackTrace();
}
	}

	
    public static void main(String[] args)
	{
     //   String studentFile = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Student.csv";
        //String addressFile = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Address.csv";
        //String class1File = "C:\\Users\\HP\\eclipse-workspace\\Innogent_Task2_P_1\\src\\com\\task2\\file\\Class.csv";
       
       //System.out.println(studentList);
       //System.out.println(addressList);
       //System.out.println(class1List);
        

        }
    }

