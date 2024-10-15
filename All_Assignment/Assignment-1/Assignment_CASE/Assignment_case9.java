// Problem 9: Password Validator
// Create a program that validates the strength of a user's password. The program should have the
// following features:
//  Prompt the user to enter a password.
//  Implement a set of rules to check the password's strength, such as minimum length,
// inclusion of uppercase and lowercase letters, digits, and special characters.
//  Provide feedback to the user on the password's strength (e.g., weak, medium, strong).
//  Allow the user to try again if the password is not strong enough.
import java.util.Scanner;

class PasswordValidation{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        while(true){
            System.out.println("Enter your password: ");
            String pass = obj.nextLine();
            String strength = checkPass(pass);

            if(strength.equals("Strong")){
                System.out.println("your password is strong");
                break;
            }else{
                System.out.println(strength.toLowerCase() + ". Please try again.");
            }
        }
    }

    public static String checkPass(String password){
        int minlen = 8;
        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean haschar = false;
        String special = "[!@#$%^&*(),.?\":{}|<>]";

        if(password.length()<minlen){
            return "password must be atleast 8 characters long";
        }

        for(char ch:password.toCharArray()){
            if(character.isUpperCase(ch)){
                hasupper = true;
            }else if(character.isLowerCase(ch)){
                haslower = true;
            }else if(character.isDigit(ch)){
                hasdigit = true;
            }else if(special.contains(String.valueOf(ch))){
                haschar = true;
            }
        }

        if(!hasupper){
            return "password must contain atleast one uppercase letter";
        }
        if(!haslower){
            return "Password must contain at least one lowercase letter.";
        }
        if(!hasdigit){
            return "Password must contain atleast one digit";
        }
        if(!haschar){
            return "Password must contain at least one special character.";
        }


        if(password.length() >= minlen && hasupper && haslower && hasdigit && haschar){
            return "Strong";
        }else if(password.length() >= minlen && ((hasupper && haslower) || (hasupper && hasdigit) || (haslower && hasdigit))){
            return "Medium";
        }else{
            return "weak";
        }
    }
}