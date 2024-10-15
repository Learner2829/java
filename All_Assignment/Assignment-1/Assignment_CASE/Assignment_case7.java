// Problem 7: Leap Year Checker
// Write a program that checks whether a given year is a leap year. The program should have the
// following features:
//  Prompt the user to enter a year.
//  Implement the logic to determine if the year is a leap year (a year divisible by 4, except for
// years divisible by 100, unless they are also divisible by 400).
//  Display whether the entered year is a leap year or not.

import java.util.Scanner;
class Year{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
       

System.out.println("enter year");
        int y = obj.nextInt();

if((y%4 == 0 && y%100 != 0) || y%400 == 0){
        System.out.println("year is leap");
}
else{
System.out.println("year is not leap");
}


}
}