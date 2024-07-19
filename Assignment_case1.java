import java.util.Scanner;

public class Assignment_case1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        double money;
        int money_type;
        double mony_in_us;
        while (true) {
            System.out.println("(1)Enter money : ");
            System.out.println("(2)Exit... ");
            input = scan.nextInt();
            if (input == 1) {
                System.out.print("Enter Money: ");
                money = scan.nextDouble();

                System.out.println("choose your currency... ");
                System.out.println("(1)Indian Currency :");
                System.out.println("(2)US Dollar Currency :");
                System.out.println("(3)Japaneze Yen Currency :");
                System.out.println("(4)British Pound SterlingCurrency :");
                System.out.println("(5)Euro Currency :");
                money_type = scan.nextInt();
                switch (money_type) {
                    case 1:
                        mony_in_us = (83.60 * money);
                        System.out.println("Choose Currency to Convert:");
                        System.out.println("(1)US Dollar Currency :");
                        System.out.println("(2)Japaneze Yen Currency :");
                        System.out.println("(3)British Pound SterlingCurrency :");
                        System.out.println("(4)Euro Currency :");
                        int u_input = scan.nextInt();
                        if(u_input==1){
                            System.out.println("Money converted into US Dollar:"+mony_in_us);
                        }
                        else if(u_input==2){
                            System.out.println("Money converted into Japaneze Yen:"+(mony_in_us/157.28));   
                        }
                        else if(u_input==3){
                            System.out.println("Money converted into British Pound:"+(mony_in_us/0.77));   
                        }
                        else if(u_input==4){
                            System.out.println("Money converted into Euro Currency:"+(mony_in_us/0.92));   
                        }
                        else{
                            System.out.println("invalid input");   
                        }
                        break;
                    case 2:
                    //Coding Continue...
                        mony_in_us = money;
                        System.out.println("Choose Currency to Convert:");
                        System.out.println("(1)Japaneze Yen Currency :");
                        System.out.println("(2)British Pound SterlingCurrency :");
                        System.out.println("(3)Euro Currency :");
                        System.out.println("(4)Indian Currency :");
                        u_input = scan.nextInt();
                        if(u_input==1){
                            System.out.println("Money converted into US Dollar:"+mony_in_us);
                        }
                        else if(u_input==2){
                            System.out.println("Money converted into Japaneze Yen:"+(mony_in_us/157.28));   
                        }
                        else if(u_input==3){
                            System.out.println("Money converted into British Pound:"+(mony_in_us/0.77));   
                        }
                        else if(u_input==4){
                            System.out.println("Money converted into Euro Currency:"+(mony_in_us/0.92));   
                        }
                        else{
                            System.out.println("invalid input");   
                        }
                        break;
                    case 3:
                        mony_in_us = (money*157.28);
                        System.out.println("Choose Currency to Convert:");
                        System.out.println("(1) US Dollar Currency :");
                        System.out.println("(2)British Pound SterlingCurrency :");
                        System.out.println("(3)Euro Currency :");
                        System.out.println("(4)Indian Currency :");
                        break;
                    case 4:
                    mony_in_us = (money*0.77);
                    System.out.println("Choose Currency to Convert:");
                    System.out.println("(1) US Dollar Currency :");
                    System.out.println("(2)Japaneze Yen Currency :");
                    System.out.println("(3)Euro Currency :");
                    System.out.println("(4)Indian Currency :");
                        break;
                    case 5:
                    mony_in_us = (money*0.92);
                       
                    System.out.println("Choose Currency to Convert:");
                    System.out.println("(1) US Dollar Currency :");
                    System.out.println("(2)Japaneze Yen Currency :");
                    System.out.println("(3)British Pound SterlingCurrency :");
                    System.out.println("(4)Indian Currency :");
                        break;

                    default:
                        break;
                }

            } else {
                break;
            }

        }

    }
}
