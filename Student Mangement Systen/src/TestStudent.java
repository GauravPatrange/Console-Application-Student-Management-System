import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.LookAndFeel;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		studentManagement s =new studentManagement();
	
		
		do {
			System.out.println("Welcome Student Management System !");
			System.out.println("1. Add student information");
			System.out.println("2. Modify student information");
			System.out.println("3. Delete student information");
			System.out.println("4. View all student information");
			System.out.println("5. Exit");
			System.out.println("Please enter options:");
			
			int choice = scn.nextInt();
			switch(choice) {
			case 1:
				s.addStudent(studentList);
				break;
				
			case 2:
				s.update(studentList);
				break;
			
			case 3:
				s.delete(studentList);
				break;
				
			case 4:
				s.Look(studentList);
				break;
				
			case 5:
				System.out.println("Exit");
				System.out.println("Thank you..!");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice...");
			}
			
			
		}while(true);
		
		
		
		
		
		
		
		
		
	}

	
	
	
	

}
