// Ques: Most frequent character
// String s = "character" 
// cc , aa , rr so a is lexographically smaller so return it
public class HWMostFrequentCharacter04 {
    public static void main(String[] args) {
        String s = "character";
        int n = s.length();
        int maxFreq = -1;
        char ans = 'p';

        for(int i=0;i<n;i++) {
            int countFreq = 1;
            char ch = s.charAt(i);
            for(int j=i+1;j<n;j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    countFreq++;
                }
            }
            if(countFreq>maxFreq) {
                maxFreq = countFreq;
                ans = ch;
            }
            if(countFreq == maxFreq && ch<ans) {
                ans = ch;
            }
        }

        System.out.println(ans);

        
    }
}
