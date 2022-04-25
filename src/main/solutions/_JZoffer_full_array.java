import java.util.*;

/**
 * @author : sunpengyu.sonia
 * @date : 2022/4/25 10:37 上午
 * @Desc :
 */
public class _JZoffer_full_array {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        List<List<Integer>> res = permute(nums);
//        System.out.println(res);
//    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            path.add(nums[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, path, 0, nums.length);
        return res;
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> path, int first, int n) {
        if (first == n) {
            res.add(new ArrayList<>(path));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(path, i, first);
            backtrack(res, path, first + 1, n);
            Collections.swap(path, i, first);
        }
    }
}
