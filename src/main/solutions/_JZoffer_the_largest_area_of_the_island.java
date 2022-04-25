import java.util.*;

class _JZoffer_the_largest_area_of_the_island {
//    public static void main(String[] args) {
//        int[][] grid = {
//                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
//                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
//                , {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}
//                , {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}
//                , {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}
//                , {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}
//                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
//                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
//        };
//        int res = maxAreaOfIsland(grid);
//        System.out.println(res);
//    }

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int extend = findArea(grid, i, j);
                max = Math.max(max, extend);
            }
        }
        return max;
    }
    //  当前情况下可拓展的面积
    public static int findArea(int[][] grid, int i, int j) {
        int now = 1;
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int down = findArea(grid, i + 1, j);
        int up = findArea(grid, i - 1, j);
        int left = findArea(grid, i, j + 1);
        int right = findArea(grid, i, j - 1);
        //  返回最大值
        return now + up + down + left + right;
    }

}