public class understandingElseIfPart207 {
    public static void main(String[] args) {
        int i = 15;
        if(i!=15) {
            System.out.println("i is not 15");
        }
        else if(i==10) {
            System.out.println("i is 10");
        }
        else {
            System.out.println("i is 15 and (i==10) doesnt hit so this else runs directly");
        }
    }
}
