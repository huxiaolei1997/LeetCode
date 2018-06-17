import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xiaolei hu
 * @date 2018/6/17 10:52
 **/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        //int res = 0;
        int length = nums.length;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            if (map.get(num) != null) {
                int number = map.get(num);
                map.put(num, number + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public int majorityElement2(int[] nums) {
        return majorityElement(nums, 0, nums.length - 1);
    }

    public int majorityElement(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        // 右移一位
        int half = (start + end) >> 1;
        int left = majorityElement(nums, start, half);
        int right = majorityElement(nums, half + 1, end);
        if (left == right) {
            return left;
        }
        int count = 0;
        int count1 = 0;
        for (int i = start; i <= end; i++) {
            if (nums[i] == left) {
                count++;
            }
            if (nums[i] == right) {
                count1++;
            }
        }
        return count > count1 ? left : right;
    }

    public static void main(String[] args) {
        long currentTimes = System.nanoTime();
        int[] nums = {1, 1, 1, 1, 1, 2, 3, 4, 6};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement2(nums));
        long nowTimes = System.nanoTime();
        System.out.println("nowTimes - currentTimes  = " + (nowTimes - currentTimes));
    }
}
