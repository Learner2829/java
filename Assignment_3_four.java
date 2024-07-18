import  java.util.Scanner;

class Assignment_3_four {
	public static void main(String args[]){
		    Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter number which you factoriyal want");
            int table = obj1.nextInt();
            int facto=1;
            while(table>0){
                facto=facto*table;
                table--;
            }
            System.out.println("Your Factoriyal is:"+ facto);
            obj1.close();
			
	}

}