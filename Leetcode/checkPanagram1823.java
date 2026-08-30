public class checkPanagram1823 {
    public static void main(String[] args) {
        
        char freq[] = new char[26];
        int j = 0;
        for(int i=97;i<=122;i++) {
            char ch = (char)i;
            freq[j] = ch;
            j++;
        }
        for (char c : freq) {
            System.out.println(c);
        }
    }
}
