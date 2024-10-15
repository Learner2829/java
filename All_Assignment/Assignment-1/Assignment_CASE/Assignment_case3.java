/* Develop a program to manage student grades. The program should have the following features:
 Create a Student class with properties for name, student ID, and grades (in an array).
 Implement methods to:
 Add a new student
 Update a student's grades
 Calculate the average grade for a student
 Find the student with the highest average grade
Prompt the user to perform various operations, such as adding a new student, updating a
student's grades, and displaying the student with the highest average grade.  */
import java.util.Scanner;
class Student{
	String name;
	int student_id;
	int grades;
	
	void setdetail(String tname,int tstudent_id,int tgrades){
       Scanner obj = Scanner(System.in);
       name = tname;
		student_id=tstudent_id;
		grades=tgrades;
	}
	
	
	void print(){
	
	System.out.println("student_id="+student_id);
	System.out.println("name="+name);
	system.out.println("grades="+grades);
	
	}
	
	public static void main(String[] args){
		
		System.out.println("enter student number");
					
			    Scanner s = new Scanner(System.in);
   
				int n = s.nextInt();
	        obj.nextLine(); // Consume newline left by nextInt()
		
			Student[] s= new Student[n];

		
		
		do{
			system.out.println("1.enter data to  student");
			system.out.println("2.for updateing grades");
			system.out.println("3.displaying highest ");
			system.out.println("4.exit ");
			
			
			system.out.println("enter choice: ");
			int ch.s.nextInt();
			s.nextLine();
			   
		

			switch (ch){
				
				
				case 1:
						
								
							                for (int i = 0; i < n; i++) {
											System.out.println("\nEnter details for student " + (i + 1) + ":");
										System.out.print("Name: ");
										s.name= scanner.nextLine();
										System.out.print("Student ID: ");
										s.student_id= scanner.nextInt();
										scanner.nextLine();  // Consume newline left by nextInt()
										System.out.print("Number of grades: ");
										int numGrades = scanner.nextInt();
										scanner.nextLine();  // Consume newline left by nextInt()
										int[] s.grades = new int[numGrades];
										for (int j = 0; j < numGrades; j++) {
											System.out.print("Enter grade " + (j + 1) + ": ");
											s.grades[j] = scanner.nextInt();
											scanner.nextLine();  // Consume newline left by nextInt()
										}
										s[i] = new Student(name, studentId, grades);
									}
						break;
				case 2:
						break;
				case 3:
						break;
				case 4:
						System.out.println("exit.");
						break;
				default:
						System.out.println("invalid choice");
						break;
				
			}
			
			
			
			
					

		}while(ch!=4)
		
	}
}