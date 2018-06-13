/**
 * @author xiaolei hu
 * @date 2018/6/13 21:09
 **/
public class MaxAreaOfIsland {
    public int dfs(int[][] grid, int x0, int y0) {
        int s = 1;
        int n = grid.length;
        int m = grid[0].length;

        grid[x0][y0] = 0;
        int[][] dire = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < 4; i++) {
            int x = x0 + dire[i][0];
            int y = y0 + dire[i][1];
            if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1) {
                s = s + dfs(grid, x, y);
            }
        }
        return s;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int mx = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    mx = Math.max(mx, dfs(grid, i, j));
                }
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        System.out.println(maxAreaOfIsland.maxAreaOfIsland(grid));
    }
}
