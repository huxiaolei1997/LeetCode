import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/3 11:46
 **/
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                //max = Math.max(count, max);
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        int count = findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println(count);
    }
}
