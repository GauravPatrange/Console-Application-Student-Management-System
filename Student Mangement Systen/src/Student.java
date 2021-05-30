public class Student {
	private String studentName;
	private String studentRollno;
	
	
	public Student() {}
	public Student(String sname, String sno) {
		studentName=sname;
		studentRollno=sno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(String studentRollno) {
		this.studentRollno = studentRollno;
	}


}
