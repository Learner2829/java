// Problem 4: Fibonacci Sequence Generator
// Write a program that generates the Fibonacci sequence. The program should have the following
// features:
//  Prompt the user to enter the number of Fibonacci numbers to generate.
//  Use a loop to calculate and display the Fibonacci sequence up to the specified number of
// terms.
//  Optionally, allow the user to choose whether to display the sequence using
// a for loop, while loop, or recursive method.

import java.util.Scanner;
class Fibo{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
       

System.out.println("enter fibo number");
        int num = obj.nextInt();


      System.out.println("1.using for loop : ");
System.out.println("2. using while loop: ");
System.out.println("3. using rexursive : ");

System.out.println("enter choice");
int choice = obj.nextInt();
     
  switch(choice){
 
  case 1:
    System.out.println("print fibo using for loop");
     int a = 0;
     int b = 0;
 int c = 1;
 for(int i= 0;i <= num; i++){
   System.out.println(c);
a = b;
b = c;
c = a + b;
 }
 break;

case 2:
System.out.println("print fibo using while loop");
     int counter=0;
     int p = 0;
     int q = 0;
     int r = 1;
 while(counter < num){
   System.out.println(r);
        p = q;
        q = r;
        r = p + q;
        counter++;
 }
 break;
 case 3:
                System.out.println("Fibonacci sequence using recursion:");
                for (int i = 0; i <= num; i++) {
                    System.out.print(fibonacciRecursive(i) + " ");
                }
                System.out.println();
                break;
  }


       
    }
public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}