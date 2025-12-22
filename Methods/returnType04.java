
public class returnType04 {
// we can make any data types function like public static double , char , int 
    public static int eren() {  // here int is the return type of this function that means this functions value is integer and its 5(bcz we are returning 5)
        System.out.println("Human");
        System.out.println("Titan");
        return 5;  // 5 is the value of this function 
    }

    public static void main(String[] args) {  // in void function we cannot return anything so void has no value 
        // eren();  we only call this function it only prints Human and Titan
        System.out.println(eren());  // now it will print Human and Titan and 5 
        System.out.println(3 + eren());
    }
}

/*  also dry run this 
public class returnType04 {

    public static int eren(int a) {  
        System.out.println("Titan");
        if(a>0) return 5;  
        else return 10;
    }

    public static void main(String[] args) {  
        int x = eren(7);  // x =  5  and Titan will also gets print in the output
        System.out.println(3+x);  3 + 5 
    }
}
*/