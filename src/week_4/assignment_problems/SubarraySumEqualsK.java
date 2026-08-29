package week_4.assignment_problems;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
      public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int count = 0;

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            // Check how many previous prefix sums equal currentSum - k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Store/update current prefix sum frequency
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + ": " + result);

        sc.close();
    }
}
