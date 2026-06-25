public class BuiltInMethods07 {
    public static void main(String[] args) {
        // checking index builtIn function 
        String s = "Hellol hii how are you";
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('l'));  // there are two l's so it print only the first occurence of l
        System.out.println(s.indexOf("hii"));  // this method gives index of substring as well 
        
        // and if we want to print the last occurence of any repeated element/character ?
        System.out.println(s.lastIndexOf('o'));

        // we cannot get the middle occurence of repeated element/character , for eg the o is repeating 3 times so we can get its 1st and last occurence index not the middle one(which is 12)
       // for finding the middle occurenec we have to do it by ourself only there is no default built-in method to do that  

// we can even get the index of substring as well 
        String s1 = "sadbutsad hi";
        System.out.println(s1.indexOf("sad"));
        System.out.println(s1.indexOf("hi"));

       // to convert the string into lowercase 
       String str = "HEllo hi";
       System.out.println(str.toLowerCase());

       // to convert the string into uppercase
       String str1 = "hie hoeiwiH";
       System.out.println(str1.toUpperCase());  

       // starts with builtIn function
       String str2 = "prajyot";
       System.out.println(str2.startsWith("pra"));  // returns boolean value
       if(str2.startsWith("p")) {  // we can take single letter as well or we can even take full string (prajyot)
            System.out.println("happy");
       }

       // ends with builtIn function 
       System.out.println(str2.endsWith("ot"));
       if(str2.endsWith("t")) {
            System.out.println("very happy");
       }

       // if contains substring builtIn function
       // this checks if the substring is there in the string or not , the substring should be presnet as it is with the order maintained in the original string
       System.out.println(str2.contains("raj"));  // this gives answer in true or false
       System.out.println(str2.contains("pro"));  // this is not allowed , sab eksath rehna chaiye , letters should be in order 
       if(str2.contains("praj")) {
            System.out.println("happy it is containing praj");
       }






        
    }
}
