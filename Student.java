package student.java;

public class Student {
	static String Studentname = "VISHAK";
	int rollno;
	static String Schoolname = "Sri Sai play school";
	static int markscored;
	float cgpa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Studentname = new Student();
		int rollno =50;
		int markscored=99;
		float cgpa= 9.9f;
		System.out.println("StudentName"+Student.Studentname);
		System.out.println("Studentrollno"+rollno);
		System.out.println("Student markscored"+ markscored);
		System.out.println("Studentcgpa"+cgpa);
		System.out.println("StudentSchoolname"+Schoolname);

	}

	
}
