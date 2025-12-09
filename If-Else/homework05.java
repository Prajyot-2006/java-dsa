
import java.util.Scanner;

// Ques: If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred.

public class homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost Price : ");
        int costPrice = sc.nextInt();

        System.out.print("Enter selling Price : ");
        int sellingPrice = sc.nextInt();

        if(costPrice<sellingPrice){
            int profit = sellingPrice - costPrice;
            System.out.println("Profit : "+profit);
        }
        if(costPrice == sellingPrice) {
            System.out.println("No Profit No Loss");
        }
        else{
            int loss = costPrice - sellingPrice;
            System.out.println("Loss : "+loss);
        }
    }
}
