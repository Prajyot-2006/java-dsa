public class StringTrimming011 {
    public static void main(String[] args) {
        String s = "hello hi   hey  how are  u  ";
        s = s.trim().replaceAll("\\s+", " ");
        
        System.out.println(s);
    }
}
