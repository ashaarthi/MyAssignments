package week3.day1;


public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name: Asha ");
	}
	public void studentDept()
	{
		System.out.println("Student Dept:E&I ");
	}
	public void studentId()
	{
		System.out.println("Student ID: XYZ ");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
		
	}

}
