/*Ques: Take ‘n’ and ‘r’ as input and print
nCr and nPr.
 */

import java.util.Scanner;

public class homework05 {

    public static int factorial(int x) {
        int fact = 1;
        for(int i=1;i<=x;i++) {  // x=3
            fact = fact * i;
        }
        return fact;
    }

    public static int nCr(int factorialN , int factorialR , int factorialNR) {
        int solvenCr = factorialN/(factorialR*factorialNR);
        return  solvenCr;
    }

    public static int nPr(int factorialN , int factorialNR) {
        int solvenPr = factorialN/factorialNR;
        return  solvenPr;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You must enter value as n>r");
        System.out.print("Enter n(number of items) : ");
        int n = sc.nextInt();

        System.out.print("Enter r(items to be select) : ");
        int r = sc.nextInt();

        int factorialN = factorial(n);  // gives n factorial
        int factorialR = factorial(r);  // gives r factorial 
        int factorialNR = factorial(n-r);  // gives n-r factorial

        if(r<n) {
            int combination = nCr(factorialN , factorialR , factorialNR);
            System.out.println("Combination(nCr) : "+combination);

            int permutation = nPr(factorialN, factorialNR);
            System.out.println("Permutation(nPr) : "+permutation);
        }

        else {
            System.out.println("r must be smaller than n");
        }

    }
}