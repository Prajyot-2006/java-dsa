public class StringBuilderKeMethods02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("rajLad");
        System.out.println("original : "+sb);
        sb.setCharAt(1, 'o');
        System.out.println("indiviual char upadte : "+sb);
        sb.insert(1, 'a');
        System.out.println("Inserting at index 1 : "+sb);
        sb.deleteCharAt(1);
        System.out.println("Deleting index 1 : "+sb);
        
        sb.delete(2, 4);
        System.out.println("Deleting from ind 2nd to 4th : " + sb);

        sb.reverse();
        System.out.println("Reversing : "+sb);
    }
}
