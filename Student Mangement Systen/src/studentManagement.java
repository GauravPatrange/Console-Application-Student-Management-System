import java.util.ArrayList;
import java.util.Scanner;

class studentManagement {
	Scanner scn = new Scanner(System.in);

	public void addStudent(ArrayList<Student> studentList) {
		Student s1 = new Student();
		System.out.println("Enter the Student name: ");
		String sname = scn.nextLine(); 
		s1.setStudentName(sname); 
		System.out.println("Enter the Student Roll No: ");
		String sno = scn.nextLine();
		s1.setStudentRollno(sno);
		
		studentList.add(s1);
		System.out.println("Student value successfully store..!");
	}
	
	public void update(ArrayList<Student> studentList) {
		
		System.out.println("Enter the student roll no you want modify: ");
		String sno = scn.nextLine();
		
		System.out.println("Enter Student Name: ");
		String sname = scn.nextLine(); 
		 
		
		Student s1 = new Student(sname ,sno );
			
		for(int i=0;i<studentList.size();i++) {
			Student s = studentList.get(i);
			if(sno.equals(s.getStudentRollno())) {	
				studentList.set(i, s1);
				System.out.println("Student imformation update successfully");
			
			}
		}
	
	}
	
	public  void Look(ArrayList<Student> studentList) {
		System.out.println("Student name/student roll no");
		if(studentList.size() != 0) {
		
			for(int i=0;i<studentList.size();i++) {
				Student s = studentList.get(i);
					System.out.println("Name: "+ s.getStudentName()+" Rollno: "+s.getStudentRollno());
			}
			
			}else {
				System.out.println("Student Information not found..!");
		}
			
	}
	
	public void delete(ArrayList<Student> studentList) {
		if(studentList.size() == 0) {
			System.out.println("Information not found ... Add Student imformation");
			
		}else {
			System.out.println("Enter the student roll no you want delete: ");
			String sno = scn.nextLine();
			for(int i=0; i<studentList.size();i++) {
				Student s = studentList.get(i);
				if(s.getStudentRollno().equals(sno)) {
					studentList.remove(i);
					System.out.println("Student imformation deleted successfully");
				}else {
				System.out.println("Student not found ..pls try again!");
				}
			
			}
			
		}
		
	}
	
	
}