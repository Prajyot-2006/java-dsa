

import java.util.*;

public class RotateArray {  // file name 

    // Function to rotate the array
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        // Handle cases where k > n
        k = k % n;

        int[] rotated = new int[n];

        // Place elements at correct rotated position
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array elements
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Read rotation value
        int k = sc.nextInt();

        // Call rotate function
        rotateArray(nums, k);  // calling file name only 

        sc.close();
    }
}