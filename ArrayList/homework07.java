

public class homework07 {
    public static void main(String[] args) {
        int a[] = {2,5,6};
        int b[] = {1,2,3};
        int c[] = new int[a.length+b.length];

        int i = a.length - 1;  // 2
        int j = b.length - 1;  // 2
        int k = c.length - 1;  // 5

        while(i>=0 && j>=0) {
            if(a[i]>=b[j]) {
                c[k] = a[i];
                i--;
                k--;
            }
            else {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if(j==-1) {  // b khatam
            while(i>=0) {    
                c[k] = a[i];
                i--;
                k--;
            }
        }

        if(i==-1) {  // a khatam
            while(j>=0) {  
                c[k] = b[j];
                j--;
                k--;
            }
        }

        
        for (int ele : c) {
            System.out.print(ele + " ");
        }

    } 
}
