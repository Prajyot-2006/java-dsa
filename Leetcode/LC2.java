public class LC2 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = a;
        a[2] = 4;
        for (int ele : b) {
            System.out.print(ele + " ");
        }
    }
}
