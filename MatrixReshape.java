import java.util.Arrays;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        //System.out.println(nums.length);
        int row = nums.length, col = nums[0].length;
        System.out.println(row + ", " + col);
        int[][] result = null;
        if (r * c == row * col) {
            result = new int[r][c];
            for (int i = 0; i < r * c; i++) {
                result[i / c][i % c] = nums[i / col][i % col];
            }
            return result;
        } else {
            return nums;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}, {5, 6}};
        int r = 2, c = 3;
        MatrixReshape matrixReshape = new MatrixReshape();
        int[][] a = matrixReshape.matrixReshape(nums, r, c);
        System.out.println(Arrays.deepToString(a));
        //System.out.println(Arrays.to);
        //System.out.println(matrixReshape.matrixReshape(nums, r, c));
    }
}
