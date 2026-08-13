
import java.util.ArrayList;
// AL is pass by refernce not value
// here we made AL of strings not integer but it works same for integere as well
public class passByReference09 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("shinji");
        s.add("ichigo");
        for (String ele : s) {
            System.out.print(ele + " ");
        }
        change(s);
        System.out.println();
        for (String ele : s) {
            System.out.print(ele + " ");
        }
    }
    public static void change(ArrayList<String> s) {
        s.add("Aizen");
        s.add("Urahara");
    }
}
