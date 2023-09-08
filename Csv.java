import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv 
{
    public static void main(String[] args)
	{
        String studentFile = "Student.csv";
        String addressFile = "Address.csv";
        String class1File = "Class1.csv";

        List<String[]> studentList = new ArrayList<>();
        List<String[]> addressList = new ArrayList<>();
        List<String[]> class1List = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(StudentFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                studentList.add(row);
            }
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }

        if (!studentList.isEmpty()) 
		{
            studentList.remove(0);
        }

        for (String[] row : studentList) 
		{
			int id = Integer.parseInt(row[0].trim());
            String name = row[1].trim();
			int classId = Integer.parseInt(row[2].trim());
			int marks = Integer.parseInt(row[3].trim());
            String gender = row[4].trim();
			int age = Integer.parseInt(row[5].trim());

            Student student = new Student(id, name, classId, marks, gender, age);
            System.out.println(student);
        }
    }
}
