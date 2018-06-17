import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/17 11:48
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                n--;
                nums[i] = nums[n];
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 4, 5, 6};
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, 1));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
