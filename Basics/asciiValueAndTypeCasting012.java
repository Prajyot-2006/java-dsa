// In this file we will learn about ascii value and typecasting 

public class asciiValueAndTypeCasting012 {
    public static void main(String[] args) {
        char ch = 'p';  // actually ch ke dabbe me p ki ascii value store hot hai naki exact 'p' character 
//      char ch = 'pp' cant possible

        // Typecasting means ek data type se dusre data type conversion
        int value = ch;  // this will get the ascii value of character p
        System.out.println(value);

        // also can do like this 
        char ch1 = 'r';  // as we already know ch1 stores the ascii value of r character (behind the scene)
        System.out.println(ch1 + 0);  // so ch1 is nothing but a ascii value , and ascii value is an integer so integer + integer(0)  => gives u integer only so thats why ans is 114 which is the ascii value of 'r' character
        System.out.println(ch1 * 1);  // this will also give ascii value 
        System.out.println(ch1 + ch1);  // this will add the ascii values 114 + 114 = 228
        System.out.println(ch1 * ch1);

        // int to char typecasting
        int ascii = 48;
        char ch3 = (char)ascii;
        System.out.println(ch3);

        // double to int typecasting
        double x = 3.14;
        int x1 = (int)x;
        System.out.println(x1);

    }
}


/*
ASCII VALUES : 

a - 97(just remember the 1st value)             A - 65(just remember the 1st value)         0 - 48(just remember the 1st value)
b - 98                                          B - 66                                      1 - 49
c - 99                                          C - 67                                      2 - 50
.                                               .                                           .
.                                               .                                           .
.                                               .                                           .         
z - 122                                         Z - 90                                      9 - 57

*/