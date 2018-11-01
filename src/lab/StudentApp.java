package lab;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test 1 user
		Student student1 = new Student ("test", "6002123456");
		student1.setPhone("7034569164");
		student1.setCity("Fairfax");
		student1.setState("VA");
		student1.enroll("ECON201");
		student1.enroll("CALC101");
		student1.pay(550);
		System.out.println(student1.toString());
		
		Student student2 = new Student ("Harry Potter", "123456789");
	}

}

class Student implements IStudentActions {
	// class memmbers
	private static int iD = 1001;
	private String name;
	private String SSN;
	private String userID;
	private String emailID;
	private String phone;
	private String city;
	private String state;
	private int numEnrolledCourses = 0;
	private double balance = 0.0; // each class is 550.00.
	private String[] courses = new String[15];
	
	// Constructor
	public Student (String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmailID();
		iD++;
		System.out.println("Create Student Profile for "+name+"\n\t[User ID : " 
			+userID+"]\n\t[Email : "+emailID+"]");
	}
	
	private void setUserID() {
		int random;
		do {
			random = (int) (Math.random() * 10000);
		} while ((random < 1000) || (random > 9000));
		System.out.println(random);
		userID = iD + "" + random + SSN.substring(4);
		System.out.println("USER ID : " + userID);
	}
	
	private void setEmailID() {
		// Look for a space
		emailID = name;
		emailID = emailID.replaceAll("[\\s]", ".");
		emailID = emailID +"." + userID+"@test.email.edu";
		System.out.println("Email :" + emailID);
	}
		
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("Setting Phone : " + this.phone);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Setting City : "+this.city);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Setting State : " +this.state);
	}
	
	// Interface methods
	public void enroll(String courseTitle) {
		System.out.println(name + "enrolled at University of Virginia");
		courses[numEnrolledCourses] = courseTitle;
		balance = balance + 550;
		numEnrolledCourses++;
		checkBalance();
		showCourses();
	}
	public void pay(int amount) {
		System.out.println(name + " payed $" + amount + ".");
		balance -= amount;
		checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance for [" + name + "]: $" + balance);
	}
	public void showCourses() {
		// Assume that course load doesnot exceed 15 classes.  If it does, the student is out of his/her
		// mind.
		// Only want to print the array when it is not null.
		System.out.println("Courses for " + userID +":");
		for (int index=0; index<courses.length; index++) {
			if (courses[index] != null) {
				System.out.println(courses[index]);
			}
		}
	}
	
	@Override
	public String toString() {
		return "[Name : " + name + " ]\n[USER ID : " + userID +
				"]\n[EMAIL : " + emailID + "]\n[Phone : " + phone + "]\n[City :" + city + "]\n[State : " +
				state+ "]";
	}
}
