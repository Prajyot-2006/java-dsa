/*
Ques: Print all substrings
S = "gopi"
g , go , gop , gopi
o , op , opi
P , pi
i
*/

public class HW020 {
    public static void main(String[] args) {
        String s = "abc";
        int length = s.length();
        for(int i=0;i<length;i++) {
            for(int j=i;j<length;j++) {
                System.out.print(s.substring(i,(j+1)) + " ");
            }
            System.out.println();
        }
    }
}