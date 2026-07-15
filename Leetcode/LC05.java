//  Factorial Trailing Zeroes

import java.util.ArrayList;

public class LC05 {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=n;i>=1;i--) {
            if(i%5==0) {
                arr.add(i);
            }
        }
        ArrayList<Integer> prime = new ArrayList<>();
        int length = arr.size();
        int k=0;
        while(k<length) {
            int getElement = arr.get(k);
            for (int i = 2; i <= getElement; i++) {
                while (getElement % i == 0) {
                    prime.add(i);
                    getElement = getElement / i;
                }
            }
            k++;
        }
        int count = 0;
        for(int i=0;i<prime.size();i++) {
            if(prime.get(i)==5) {
                count++;
            }
        }
        System.out.println(count);
    }
}

