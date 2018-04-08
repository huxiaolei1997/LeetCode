import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        // 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
        // 先给数组从小到大排序，然后对偶数下标的数组value进行求和（下标从 0 开始）
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
           if (i % 2 == 0) {
               sum += nums[i];
           }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int[] s = new int[]{1, 2, 3, 2};
        int result = arrayPairSum.arrayPairSum(s);
        System.out.println(result);
    }
}
