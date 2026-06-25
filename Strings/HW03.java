// Ques: Count the number of vowels in a given string

public class HW03 {
    public static void main(String[] args) {
        String s = "i am prajyot jore";
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println(count);

    }
}
