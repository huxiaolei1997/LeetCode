import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * @author xiaolei hu
 * @date 2018/6/10 11:55
 **/
public class GenerateYangHui {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(1);
            for (int j = 1; j < i; j++) {
                integerList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            if (i > 0) {
                integerList.add(1);
            }
            list.add(integerList);
        }
        return list;
    }

    public static void main(String[] args) {
        GenerateYangHui generateYangHui = new GenerateYangHui();
        System.out.println(generateYangHui.generate(5));
    }
}
