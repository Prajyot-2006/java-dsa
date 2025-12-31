/*
While Loop : 
Usecase: Generally used when conditions are more than one.
Jab bhi iterations nahi pata ho ki kitni hai
*/

public class whileAndDowhile015 {
    public static void main(String[] args) {
        System.out.println("For loop : ");
        for(int i=1;i<=5;i++) {  // initialization;condition;increment
            System.out.println(i);  // printing statement 
        }

        System.out.println("While loop : ");

        // while loop
        int i = 1;  // initialization
        while(i<=5) {   // condition
            System.out.println(i);   // printing statement 
            i++;   // increment
        }

        System.out.println("While loop : ");

        // do while loop
        int j = 1;  // initialization
        do {   // in do while even if the condition is false 1 time the loop will execute no matter what condition is 
            System.out.println(j);   // printing statement 
            j++;   // increment
        } while(i<=5);  // condition
    }
}
