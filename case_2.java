import java.util.Scanner;
public class case_2{
    public static void main(String[] args) {
         
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Number of readings you want :");
     int num=scan.nextInt();
     int[] cold=new int[num];
     int[] mild=new int[num];
     int[] hot=new int[num];
     if(num<0){
        System.out.println("Invalid Input.Number of readings should be posistive.");
     }
     double[] temp=new double[num];
     for(int i=0;i<num;i++){

        System.out.println("Enter Temperature:"+(i+1));
        temp[i]=scan.nextDouble();
        scan.nextLine();
        // System.out.printf("Tempreature is %.2f \u00B0C.\n",temp[i]);
    }
    
    System.out.println("Chart of Tempreature type:");
    System.out.println("-------------------------");
    System.out.println("Cold Below 10 \u00B0C.");
    System.out.println("-------------------------");
    System.out.println("Mild Below 10 to 25 \u00B0C.");
    System.out.println("-------------------------");    
    System.out.println("Hot Above 25 \u00B0c.");
    System.out.println("-------------------------");   
    int i_cold=0;
    int i_mild=0;
    int i_hot=0;
    double min=0;
    double max=0;
    // double avg;
    double sum=0;

    for(int i=0;i<num;i++){
        sum=sum+temp[i];
        if(temp[i]<min){
            min=temp[i];
        }
        if(max<temp[i]){
          max=temp[i];
        }
        if(temp[i]<10){
            cold[i_cold]=i;
            i_cold++;
        } 
        else if(temp[i] >= 10 && temp[i] <= 25){
            mild[i_mild]=i;
            i_mild++;
        }
        else{
            hot[i_hot]=i;
            i_hot++;
        }

  // System.out.printf("Tempreature is %.2f \u00B0C.\n",temp[i]);
    }

    
     System.out.println("Cold");
      for(int k=0;k<i_cold;k++){
          int m;
          m=cold[k];
          System.out.println("Tempreature index is :"+m+"tempreature is :"+temp[m]);
      }
      
     System.out.println("Mild");
      for(int k=0;k<i_mild;k++){
        int m;
        m=mild[k];
        System.out.println("Tempreature index is :"+m+"tempreature is :"+temp[m]);
    }
    
    System.out.println("Hot");
    for(int k=0;k<i_hot;k++){
        int m;
        m=hot[k];
        System.out.println("Tempreature index is :"+m+"tempreature is :"+temp[m]);
    }
    System.out.println("Maximum Tempreature is "+max+".");
    System.out.println("Minimum Tempreature is "+min+".");
    System.out.println("Average Tempreature is:"+(sum/num)+".");

     }
}