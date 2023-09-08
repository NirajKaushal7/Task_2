public class Address {

int 	id;
int pin_code;
String city;
int student_id;

public Address() {
		// TODO Auto-generated constructor stub
	}


public Address(int id, int pin_code, String city, int student_id) {
	super();
	this.id = id;
	this.pin_code = pin_code;
	this.city = city;
	this.student_id = student_id;
}

@Override
	public String toString() {
		return "Address [id=" + id + ", pin_code=" + pin_code + ", city=" + city + ", student_id=" + student_id + "]";
	}
}
