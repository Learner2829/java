import java.util.Scanner;
public class Assignment_3_two {
//     Implement a program that uses a switch-case statement to determine the day of the week 
// based on a numeric input (1 for Monday, 2 for Tuesday, etc.).
public static void main(String[] args) {
    System.out.println("Enter a Number which you want to find week day:");
    Scanner obj = new Scanner(System.in);
    int num=obj.nextInt();
    switch(num){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thurseday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default :
            System.out.println("Youre input is wrong");
            break;
    }
    
    obj.close();
}

}