
public class basics01 {
    public static void main(String[] args) {
        // for storing a letter we usually use character variable , and for more letters/texts we use character array
        char arr[] = {'p','r','a','j','y','o','t'};
        System.out.println(arr);  // this wont print the address of character array , but it prints the characters itself

        // but to store sentence or paragraph ? => for that we use string (it is treated as a datatype that can store sentences)
        String s = "Prajyot Jore is watching Dhurandar";
        System.out.println(s);  // this is a string 

        // we can print a particular index of character array 
        System.out.println(arr[2]);

        // strings also has indexes 
        System.out.println(s.charAt(8)); // for eg accesing an index in the s varaible 
        // space also contains index 
        System.out.println(s.charAt(7));
        int n = s.length();  // length of the string
        System.out.println(n); 
        // System.out.println(arr.length);

    }
}
