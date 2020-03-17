package leetcode.math;

import java.util.ArrayList;
import java.util.List;

// 60.第k个排列
//生成输入数组，存储从 11 到 NN 的数字。
//计算从 00 到 (N - 1)!(N−1)! 的所有阶乘数。
//在 (0, N! - 1)(0,N!−1) 区间内，kk 重复减 11。
//计算 kk 的阶乘，使用阶乘系数构造排列。阶乘系数对应着nums数组的下标取对应的值。
// 如：[1,2,3] 系数为2时总是取到3，系数为1时总是取到2，存在一一对应关系
//返回排列字符串。
public class GetPermutation {
    public String getPermutation(int n, int k) {
        int[] factorials = new int[n];
        List<Integer> nums = new ArrayList() {{add(1);}};

        factorials[0] = 1;
        for(int i = 1; i < n; ++i) {
            factorials[i] = factorials[i - 1] * i;
            nums.add(i + 1);
        }

        --k;

        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i > -1; --i) {
            int idx = k / factorials[i];
            k -= idx * factorials[i];

            sb.append(nums.get(idx));
            nums.remove(idx);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GetPermutation getPermutation = new GetPermutation();
        System.out.println(getPermutation.getPermutation(4,9));
    }
}
