import  java.util.Scanner;

class Assignment_3_three{
	public static void main(String args[]){
		    Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter number which table you want");
			int table = obj1.nextInt();
			for(int i=1;i<=10;i++){
				System.out.println(table+"x"+i+"="+table*i);
			}
	}
	
	
}