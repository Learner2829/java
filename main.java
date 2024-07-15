 import java.util.Scanner;
 class hello{
	public static void main(String args[]){
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Number one");
		float data1=obj1.nextFloat();
		System.out.println("Enter Second number");
		float data2=obj1.nextFloat();
		System.out.println("Enter operator which operation you want");
		char op=obj1.next().charAt(0);
		
		switch(op){
			case '+':
			System.out.println(data1+data2);
			break;
			case '-':
			System.out.println(data1-data2);
			break;
			case '/':
			System.out.println(data1/data2);
			break;
			case '*':
			System.out.println(data1*data2);
			break;
			default:
			System.out.println("Enter valid input");
			break;
		}
		//System.out.println(data1+data2);
		//System.out.println("Hello word"+args[0]);
	}
}