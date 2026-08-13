import java.util.*;

public class machineTest {

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] rotated = new int[n];

       
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int k = sc.nextInt();

        rotateArray(nums, k);
        sc.close();
    }
}