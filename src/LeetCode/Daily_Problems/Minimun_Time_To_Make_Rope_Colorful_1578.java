package LeetCode.Daily_Problems;

public class Minimun_Time_To_Make_Rope_Colorful_1578 {

    public static int minCost(String s, int[] cost) {
        int res = 0, max_cost = 0, sum_cost = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
                res += sum_cost - max_cost;
                sum_cost = max_cost = 0;
            }
            sum_cost += cost[i];
            max_cost = Math.max(max_cost, cost[i]);
        }
        res += sum_cost - max_cost;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        String s = "abaac";
        System.out.println(minCost(s,arr));
    }
}
