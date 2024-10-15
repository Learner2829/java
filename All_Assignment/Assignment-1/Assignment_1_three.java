
public class Assignment_1_three {
    public void ftemp(double c){
        double f=c*9/5+32;
          System.out.println("Temperature in Fahrenheit:"+f+'F');
    }
        public void ctemp(double f){
        double c=(f-32) * 5/9;
        int c_t=(int)c;
          System.out.println("Temperature in Celsius:"+c_t+'C');
    }
     public static void main(String args[]){
        // mplement a program that converts temperature from Celsius to Fahrenheit and vice versa.
        Assignment_1_three obj2 = new Assignment_1_three();
        double temp=23;
        obj2.ftemp(temp);
        obj2.ctemp(73.4);
     }
}
