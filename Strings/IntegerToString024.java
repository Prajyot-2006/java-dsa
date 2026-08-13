public class IntegerToString024 {
    public static void main(String[] args) {
        String arr[] = {"hi","hello"};
        arr[1] = Integer.toString(4);
        for (String ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
