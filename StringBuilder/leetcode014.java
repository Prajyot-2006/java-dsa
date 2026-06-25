/* 

599. Minimum Index Sum of Two Lists
*/

import java.util.ArrayList;

public class leetcode014 {
    public static void main(String[] args) {
        String arr1[] = {"happy","sad","good"};
        String arr2[] = {"sad","happy","good"};
        ArrayList<String> ans = new ArrayList();
        ArrayList<Integer> ind = new ArrayList();
        ArrayList<Integer> store = new ArrayList();
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                if(arr1[i].equals(arr2[j])) {
                    ans.add(arr1[i]);
                    ind.add(i);
                    ind.add(j);
                }
            }
        }
        System.out.println(ans);
        System.out.println(ind);
        for(int i=0;i<ind.size();i=i+2) {
            store.add(ind.get(i)+ind.get(i+1));
        }
        System.out.println(store);
        int min = store.get(0);
        ArrayList<String> finalAns = new ArrayList();


        for(int i=1; i<store.size(); i++) {
            if(store.get(i) < min) {
                min = store.get(i);
            }
        }
        for(int i=0; i<store.size(); i++) {
            if(store.get(i) == min) {
                finalAns.add(ans.get(i));
            }
        }
        System.out.println(min);
        System.out.println(finalAns);

        

        
    }
}