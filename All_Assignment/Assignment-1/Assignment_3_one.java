
import java.util.Scanner;
public class Assignment_3_one {
//     Write a program that takes a number as input and determines whether it is even or odd 
// using an if-else statement
public static void main(String[] args) {
    System.out.println("Enter a variable which you want to find odd or even:");
    Scanner obj = new Scanner(System.in);
    int num=obj.nextInt();
    if(num%2==0){
        System.out.println("Your number is even");
    }
    else
    {
        System.out.println("Your number is odd");
    }
    
    obj.close();
}

}