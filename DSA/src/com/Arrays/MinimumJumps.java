package com.Arrays;

public class MinimumJumps {
    public static void main(String[] args) {
        int [] arr  = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    }
    class Solution {
        public int minJumps(int[] arr) {
            int n = arr.length;

            // Edge cases
            if (n <= 1) return 0;
            if (arr[0] == 0) return -1;

            int maxReach = arr[0];
            int steps = arr[0];
            int jumps = 1;

            for (int i = 1; i < n; i++) {

                // If we've reached the end
                if (i == n - 1)
                    return jumps;

                // Update maximum reach
                maxReach = Math.max(maxReach, i + arr[i]);

                steps--;

                // If no steps left, must jump
                if (steps == 0) {
                    jumps++;

                    // If we cannot move further
                    if (i >= maxReach)
                        return -1;

                    steps = maxReach - i;
                }
            }

            return -1;
        }
    }

}


