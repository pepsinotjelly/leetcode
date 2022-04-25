import java.util.ArrayList;
import java.util.List;

/**
 * @author : sunpengyu.sonia
 * @date : 2022/4/25 11:18 上午
 * @Desc :
 */
public class _letter_case_permutation {
//    public static void main(String[] args) {
//        System.out.println(letterCasePermutation("a1b2"));
//    }
//
    public static List<String> letterCasePermutation(String s) {
        List<StringBuilder> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        res.add(new StringBuilder());
        for (char c : s.toCharArray()) {
            int n = res.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; i++) {
                    res.add(new StringBuilder(res.get(i)));
                    res.get(i).append(Character.toLowerCase(c));
                    res.get(n + i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; i++) {
                    res.get(i).append(c);
                }
            }
        }
        for (StringBuilder str : res) {
            ans.add(str.toString());
        }
        return ans;
    }
}
