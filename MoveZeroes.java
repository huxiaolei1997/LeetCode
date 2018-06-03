import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaolei hu
 * @date 2018/6/3 12:04
 **/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
//        List<Integer> nonZeroElements = new ArrayList<>();
//        for(int i = 0 ;i < nums.length;i++){
//            if( nums[i] != 0 ){
//                nonZeroElements.add(nums[i]);
//            }
//        }
//
//        for(int j = 0 ; j < nonZeroElements.size() ; j++){
//            nums[j] = nonZeroElements.get(j);
//        }
//
//        for(int i = nonZeroElements.size() ; i < nums.length ;i++){
//            nums[i] = 0;
//        }
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        for (int i = count; i < length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
