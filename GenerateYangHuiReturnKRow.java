import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * @author xiaolei hu
 * @date 2018/6/12 10:29
 **/
public class GenerateYangHuiReturnKRow {
    public List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
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
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        //GenerateYangHui generateYangHui = new GenerateYangHui();
        GenerateYangHuiReturnKRow generateYangHuiReturnKRow = new GenerateYangHuiReturnKRow();
        System.out.println(generateYangHuiReturnKRow.generate(0));
    }
}
