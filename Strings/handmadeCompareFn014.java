public class handmadeCompareFn014 {

    public static int compareTo(String s1 , String s2) {
        int lengths1 = s1.length();  // 7 
        int lengths2 = s2.length();  // 6
        int small = 0;
        if(lengths1<lengths2) {
            small = lengths1;
        }
        else {
            small = lengths2;
        }
        int store = 0;
        int k = 0;

        for(int i=0;i<small;i++) {
            if(s1.charAt(i)==s2.charAt(i)) {
                k++;
            }
            else {
                store = s1.charAt(i) - s2.charAt(i);
                break;
            }

            if(k==lengths1 || k==lengths2) {
                store = lengths1 - lengths2;
            }
        }
        return store;
    }


    public static void main(String[] args) {
        String s1 = "praju";
        String s2 = "peren";
        System.out.println(compareTo(s1,s2));
    }
}
