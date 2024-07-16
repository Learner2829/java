import java.util.Scanner;
class Assignment_1_two {
     public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
        float hight=20;
        System.out.print("Enter hight of rectangle:");
        hight=obj.nextFloat();
        System.out.println();
        float width=20;
        System.out.print("Enter width of rectangle:");
        width=obj.nextFloat();
        System.out.println("Area of rectangle is:"+hight*width);
        obj.close();
     }
}
