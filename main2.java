import  java.util.Scanner;

class Table{
	public static void main(String args[]){
		    Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter number which table you want");
			int table = obj1.nextInt();
			System.out.println("Enter number which range you want for table");
			int range = obj1.nextInt();
			for(int i=1;i<=range;i++){
				System.out.println(table+"x"+i+"="+table*i);
			}
		
	}
	
	
}