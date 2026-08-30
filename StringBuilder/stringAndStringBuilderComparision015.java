public class stringAndStringBuilderComparision015 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder("hello");

        if(s.equals(sb.toString())) {  // Convert sb to String using .toString()
            System.out.println("Same");
        }
    }
}
// s is String
// sb is StringBuilder
// Convert sb to String using .toString()
// Then only compare String values using .equals()