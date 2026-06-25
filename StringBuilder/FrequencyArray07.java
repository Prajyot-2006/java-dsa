/*
Solving same problem using frequency array
Ques: Most frequent character
String s = "character" 
cc , aa , rr so a is lexographically smaller so return it
*/

public class FrequencyArray07 {
    public static void main(String[] args) {
        String s = "chrcterbb";
        int freq[] = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            int fr = ch - 97;;
            freq[fr]++;
        }
        int maxFreq = -1;
        char ans = 'a';
        for(int i=0;i<25;i++) {
            if(freq[i]>maxFreq) {  // no need for checking if freq[i]==maxFreq bcoz array is already sorted (0 to 25 in index and a to z in alphabet so no need to worry about)
                maxFreq = freq[i];
                ans = (char)(97+i);
            }
        }
        System.out.println(ans);
        

    }
}
