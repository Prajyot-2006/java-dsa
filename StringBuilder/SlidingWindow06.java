
import java.util.Arrays;

/*
Ques: Most frequent character
String s = "character" 
cc , aa , rr so a is lexographically smaller so return it

Solving same problem using sliding window 
*/

public class SlidingWindow06 {
    public static void main(String[] args) {
        String s = "character";
        int n = s.length();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        System.out.println(s);
        int maxFreq = -1;
        char ans = 'o';  // 
        int j = 0;
        int i=0;
        while(j<n) {
            if(s.charAt(i)==s.charAt(j)) {
                j++;
            }
            else {
                int countFreq = j-i;
                if(countFreq>maxFreq) {
                    maxFreq = countFreq;
                    ans = s.charAt(i);
                }
                i=j;
            }
        }
        // we have to do this one more time bcoz eg : aaccettzzz dry run this input u will get to know why this last step is required again
        int countFreq = j-i;
        if(countFreq>maxFreq) {
            maxFreq = countFreq;
            ans = s.charAt(i);
        }
        System.out.println(ans);
    }
}
