// Easy level problem

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Example 2:
// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Constraints:
// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.


// Was able to finish this very quickly. Took two tries. The first try didn't use the else, which lowered the time complexity slightly.

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consec = 0;
        int largestConsec = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consec++;
            } else if (nums[i] == 0 ) {
                consec = 0;
            }
            if (consec > largestConsec) {
                largestConsec = consec;
            }
        }
        return largestConsec;
    }
}
