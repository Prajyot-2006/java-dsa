/*
202. Happy Number */

public class LC3 {

    public static int update(int n) {

        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }


    public static void main(String[] args) {

        int n = 2;

        while(n != 1 && n != 4) {
            n = update(n);
        }

        if(n == 1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}