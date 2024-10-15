// Problem 6: BMI Calculator
// Create a program that calculates a person's Body Mass Index (BMI) and provides an interpretation of
// the result. The program should have the following features:
//  Prompt the user to enter their height (in meters) and weight (in kilograms).
//  Calculate the BMI using the formula: BMI = weight / (height * height).
//  Determine the BMI category (underweight, normal, overweight, or obese) based on the
// calculated BMI.
//  Display the user's BMI value and the corresponding BMI category.

import java.util.Scanner;
class BMICalculator{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your height(in meters): ");
        double height = obj.nextDouble(); 

        System.out.println("Enter your weight(in Kilograms): ");
        double weight = obj.nextDouble();

        double bmi = Calculate(weight, height);

        System.out.println("your BMI: "+bmi);
        categorize(bmi);


    }

    public static double Calculate(double weight, double height){
        double BMI = weight / (height*height);
        return BMI;
    }

    public static void categorize(double bmi){
        if(bmi<18){
            System.out.println("unhderweight");
        }else if(bmi>18 && bmi<25){
            System.out.println("healthy");
        }else if(bmi>25 && bmi<30){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }
    }
}