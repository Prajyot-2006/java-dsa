public class leetcode09 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int count = 0;
        int index = -1;
        if(haystack.contains(needle)) {
            count = 1;
            index = haystack.indexOf(needle);
        }
        System.out.println(index);

    }
}
 