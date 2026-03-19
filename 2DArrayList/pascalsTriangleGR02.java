// Leetcode Ques no 118 Pascals Triangle: 

import java.util.ArrayList;

public class pascalsTriangleGR02 {
    public static void main(String[] args) {
        int n = 4;
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++) {
                if(i==j || j==0) {
                    arr.get(i).add(1);
                }
                else {
                    int val = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).add(val);
                }
            }
        }
        for (ArrayList<Integer> singleList : arr) {
            for (int ele : singleList) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
