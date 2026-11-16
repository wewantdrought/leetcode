package neetcode_pratices;

/*
You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]

Output: 3

Example 2:

Input: nums = [1,0,1,1,0,1]

Output: 2
Constraints:

1 <= nums.length <= 100,000
nums[i] is either 0 or 1.
 */

/*
archive
public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 1) {
                ++count;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }

            if (count > max) {
                    max = count;
                }
        }
        return max;
*/

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                ++cnt;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public static void main(String[] args) {
        ConsecutiveOnes solution = new ConsecutiveOnes();
        int[] nums = {1,0,0,1,1,1};
        int res = solution.findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}

