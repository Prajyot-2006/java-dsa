// Ques: Palindrome String

public class HW04 {
    public static void main(String[] args) {
        String s = "mommo";
        boolean check = false;
        int n = s.length();
        int count = 0;
        int i=0;
        int j=n-1;
        while(i<j) {
            if(s.charAt(i)==s.charAt(j)) {
                count++;
                i++;
                j--;
                check = true;
            }
            else {
                check = false;
                break;
            }

        }
        System.out.println(check);
            
        
    }
}
