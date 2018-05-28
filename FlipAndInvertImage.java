import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                // 对称交换变量的值
                int t = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - j - 1] = t;
                //ArrayList arrayList = new ArrayList();
                //Collections.reverse(Arrays.asList(A[i]));
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                // 1 变 0，0 变 1
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
        int[][] B = flipAndInvertImage.flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(B));
    }
}
