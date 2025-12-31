// just dry run this 
// also this is knownn as shallow copy (means Only the reference(s) are copied, not the actual object data.)


public class moreAboutReference09 {
    public static void main(String[] args) {
        int arr[] = {10,20,30};  // this array is pointing to some particular reference
        System.out.println("arr ka Refernce value : "+arr);
        int x[] = arr;  // this x will get same reference of arr  Inshort this x is pointing to the same reference value of the arr
        x[1] = 100;  
        System.out.println("x ka Reference value : "+x);
        System.out.println(arr[1]);  // 100 
        // both are pointing to the same address(reference)thats why the 1st array is updating according to x array
    }
}