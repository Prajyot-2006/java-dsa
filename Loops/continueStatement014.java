public class continueStatement014 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
            if(i==13) {  // agar continue hit hua toh iske niche ka code nahi chalega or the code will get skiped for that particular iteration 
                continue;
            }
            System.out.println("Good morning");
        }
    }
}
