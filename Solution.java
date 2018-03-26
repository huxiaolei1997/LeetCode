package leet_code;

import java.util.Arrays;

public class Solution {
	// LeetCode两数之和
	public int[] twoSum(int[] nums, int target) {
		int[] value = new int[2];
		int len = nums.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				int num = target - nums[i];
				if (num == nums[j]) {
					value[0] = i;
					value[1] = j;
					return value;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {3, 2, 4};
		int target = 6;
		int[] result = solution.twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

}
