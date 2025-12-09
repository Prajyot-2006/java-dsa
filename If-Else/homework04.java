// Ques: Take real number input and check if it is an integer or not.

import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number : ");
        double n = sc.nextDouble();  // 3.14  

        // TypeCasting from double to int 
        int x = (int)n;  // 3 

        // check if the real no is integer 
        if(n-x>0){
            System.out.println("Not an integer");
        }
        else{
            System.out.println("Is an Integer");
        }




        
        

    }
}
