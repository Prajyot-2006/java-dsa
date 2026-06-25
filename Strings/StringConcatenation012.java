public class StringConcatenation012 {
    public static void main(String[] args) {
        String s = "";
        for(int i=0;i<3;i++) {
            char ch = (char) ('a' + i);
            s = s + ch;  // s is an string and ch is an character , so the operation of both results in string 
        }
        System.out.println(s);
    }
}
