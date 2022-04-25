import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : sunpengyu.sonia
 * @date : 2022/4/25 11:09 上午
 * @Desc :
 */
public class _JZoffer_permute_unique {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,2,1}));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        for (int i : nums) {
            path.add(i);
        }
        backtrack(res, path, 0, path.size());
        return res;
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> path, int first, int n) {
        if (first == n) {
            if (!res.contains(path)) {
                res.add(new ArrayList<>(path));
            }
        }
        for (int i = first; i < n; i++) {
            Collections.swap(path, i, first);
            backtrack(res, path, first + 1, n);
            Collections.swap(path, i, first);
        }
    }
}
