public class StringBuilder01 {
    public static void main(String[] args) {
        // internally String builder me character arraylist hi maninatain ho raha hai 
        StringBuilder s = new StringBuilder("prajyot");  // just like arraylist , currently it has prajyot but the string builder has more capacity to store more strings with different data types
        System.out.println(s);
        s.append("jore"); // we can add any data types in the string 
        s.append(true);  //  append normal string me nahi hota sirf stringbuilder me hota 
        s.append(10);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());  // Default capacity of a StringBuilder is: 16 + initial string length
        // initial string is prajyot so length = 7 so capacity = 7+16=23

        StringBuilder sb = new StringBuilder();  // initial string lenght is 0 so 
        System.out.println(sb.capacity()); // so capacity = 0 + 16 = 16
        // we can give it our own size as well 
        StringBuilder str = new StringBuilder(10);  // 10 is capacity which we gave/decided 
        System.out.println("The capacity for str : "+ str.capacity());

        // wecan update StringBuilder's indiviual character
        s.setCharAt(2, 'o');  // just like arraylist  ye 0(1) complexity me hua unlike string
        System.out.println(s);

        char ch = s.charAt(2);
        System.out.println(ch);

        s.deleteCharAt(3);
        System.out.println(s);

        String t = s.toString();
        // String t = s;  - this is error 
        System.out.println(t);
    }
}
