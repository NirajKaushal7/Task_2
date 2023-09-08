public class Student {
int id;
String name;
int class_id;
int marks;
String gender;
int age;
	

public Student() {
	// TODO Auto-generated constructor stub
}

	public Student(int id, String name, int class_id, int marks, String gender, int age) {
	super();
	this.id = id;
	this.name = name;
	this.class_id = class_id;
	this.marks = marks;
	this.gender = gender;
	this.age = age;
}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", class_id=" + class_id + ", marks=" + marks + ", gender="
				+ gender + ", age=" + age + "]";
	}


}
