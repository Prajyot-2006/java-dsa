// x++ x-- ++x --x
/*
x++ means x = x+1
++x also means x = x+1
x-- means x = x-1
--x also means x = x-1
*/

/*
    ✅ x++ —> Post-increment
    The current value of x is used first.
    Then x is increased by 1.
*/

/*
    ✅ ++x — Pre-increment
    x is increased by 1 first.
    Then the new value is used.
*/

public class incrementDecrement013 {
    public static void main(String[] args) {

        // Post increment example : 
        int x = 5;
        int y = x++; // y gets 5, then x becomes 6
        System.out.println(y);
        System.out.println(x);

        // Pre increment example
        int a = 5;
        int b = ++a;  // a becomes 6, then b gets 6
        System.out.println(a);
        System.out.println(b);

        // another post increment example Why does x++ directly increase the value here?
        int z = 3;
        z++;              // post-increment
        System.out.println(z);  // 4
/*
Why does x++ directly increase the value here?
In this example, the value becomes 3 because you are not using x++ inside another expression.

✔ When x++ is used alone as a statement:
It still means “use the value, then increment”
But since nothing is using the value, you don’t notice the difference
The result is simply that x increases by 1
The difference only matters when you use the expression’s value
*/

        int p = 10;
        System.out.println(p++);  // 10
        System.out.println(p);  // 11

    }
}