import java.util.Scanner;

class Student {
    // Create a Student class with the following properties: name, grade, and age.
    // Implement the following
    // methods:
    // setName(String name): Sets the student's name.
    // getGrade(): Returns the student's grade.
    // incrementAge(): Increments the student's age by 1.
    // printStudentInfo(): Prints the student's name, grade, and age
    String name;
    String grade;
    int age;

    public void set(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public int getGrade() {
        switch (this.grade) {
            case "A":
                return 4;

            case "B":
                return 3;

            case "C":
                return 2;

            case "D":
                return 1;

            default:
                return 0;

        }

    }

    public void printStudentInfo() {
        System.out.println("Name:" + name);
        System.out.println("Grade:" + grade);
        System.out.println("Age:" + age);
        System.out.println("-----------------------------------");
    }

    public void incrementAge() {
        age = age + 1;
    }

    // In the main method, create an array of Student objects and perform the
    // following tasks:
    // Prompt the user to enter the number of students.
    // Create the Student objects and populate their information.
    // Use a for loop to iterate through the array and call the printStudentInfo()
    // method for each
    // student.
    // Find the student with the highest grade and print their information.
    // Note: Remember to include appropriate comments and documentation throughout
    // your code to
    // make it more readable and maintainable
    public static void main(String[] args) {
        System.out.println("Enter a Number of students:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.nextLine();
        Student[] s1 = new Student[num];
        int i;
        for (i = 0; i < num; i++) {
            s1[i] = new Student();
            System.out.println("Enter Details of Student :" + (i + 1));
            System.out.println("Enter a Name of students:");
            s1[i].name = obj.nextLine();
            System.out.println("Enter a Age of students:");
            s1[i].age = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter a Grade of students:");
            s1[i].grade = obj.nextLine();
            obj.nextLine();
        }
        for (i = 0; i < num; i++) {
            s1[i].printStudentInfo();
        }
        int hig_index = 0;
        for (i = 0; i < num; i++) {
            if (s1[i].getGrade() > s1[hig_index].getGrade()) {
                hig_index = i;
            }
        }
        System.out.println("Higest student Information is:");
        s1[hig_index].printStudentInfo();
        obj.close();

    }

}