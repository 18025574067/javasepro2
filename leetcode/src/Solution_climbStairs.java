//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
//
//
// 示例 1：
//
//
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶
//
// 示例 2：
//
//
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
//
//
//
//
// 提示：
//
//
// 1 <= n <= 45
//
// Related Topics 记忆化搜索 数学 动态规划 👍 2377 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution_climbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

//    private static Map<Integer, Integer> maps = new HashMap<>();
//    private static int climbStairs(int n) {
//        // 递归解法
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        if (maps.get(n) != null)
//            return maps.get(n);
//        else {
//            int result = climbStairs(n-1) + climbStairs(n-2);
//            maps.put(n, result);
//            return result;
//        }
//    }


    private static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int per = 2;
        int perPer = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = per + perPer;
            perPer = per;
            per = result;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
