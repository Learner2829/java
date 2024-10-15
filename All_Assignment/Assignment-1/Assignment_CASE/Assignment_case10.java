// Problem 10: Grocery List Manager
// Develop a program that helps users manage their grocery list. The program should have the 
// following features:
//  Allow the user to add items to the grocery list.
//  Provide the ability to mark items as purchased or remove them from the list.
//  Display the current grocery list, including the purchased and remaining items.
//  Implement a search functionality to find specific items on the list.
//  Optionally, allow the user to save and load the grocery list to/from a file
import java.util.Scanner;
class Grocery{
    int count=-1;
    String[] list;
    int p_count=-1;
    int pn_count=-1;
    int[] pn_pur;
    int[] pur;
    Grocery(int size){
        list = new String[size];
        pur=new int[size];
        pn_pur=new int[size];
    }
    void add_grocery(String p1){
        count++;
        list[count]=p1;
    }
    void Show(){
        System.out.println("-----------------------------");
        System.out.println("You Listed item is:");
        for(int i=0;i<=count;i++){
            System.out.println(list[i]);
        }
        if(p_count==-1){
            System.out.println("You are not selected any item");
        }
        else
        {
            System.out.println("-----------------------------");
            System.out.println("Purchesd item is:");
            for(int i=0;i<=p_count;i++){
                int index=pur[i];
                System.out.println(list[index]);
            }
            System.out.println("-----------------------------");
            System.out.println("remaining items is:");
            for(int i=0;i<=pn_count;i++){
                int index=pn_pur[i];
                System.out.println(list[index]);
            }
        }
        System.out.println("-----------------------------");

    }
    void purchased(){
        Scanner scan=new Scanner(System.in);
            for(int i=0;i<=count;i++){
            System.out.println("If You purchased this item then type Y,Otherwise type N:"+list[i]);
            String input;
            input=scan.nextLine();
            // scan.nextLine();
            if(input.equalsIgnoreCase("Y")){
                p_count++;
                pur[p_count]=i;
                System.out.println("Marks as Purchased");
            }
            else if(input.equalsIgnoreCase("N")){
                pn_count++;
                pn_pur[pn_count]=i;
                System.out.println("Marks as unpurchased");
            }
            else
            {
             System.out.println("invalid input");
            }
        }
    }
    int search(String p1){
        if(count==-1){
            System.out.println("Your List is emty");
            return 0;
        }
        else
        {
            int i;
            for(i=0;i<=count;i++){
                if(list[i]==p1){
                    
                    return 1;
                    
                }
            }
            if(i>count){
                return 0;
            }
            else
            {
                return 0;
            }
        }
    }
    public static void main(String args[]){
        Grocery g1 = new Grocery(10);
        Grocery g2 = new Grocery(10);
        g1.add_grocery("potato");
        g1.add_grocery("tomato");
        g1.add_grocery("water melon");
        g1.add_grocery("apple");
        g1.purchased();
        g1.Show();
        int data=g1.search("apple");
        System.out.println(data);
        // g2.Show();
    }
}
