package Interview.ByteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int D = scanner.nextInt();
            int W = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }

            // 如果初始水量就足够，无需补给
            if (W >= D) {
                System.out.println(0);
                return; // 这里加个return
            }
            if (W == 0) {
                System.out.println(-1);
                return;
            }

            int length = list.size();
            int N = length / 2;
            int[][] supplies = new int[N][2];
            for (int i = 0; i < N; ++i) {
                supplies[i][0] = list.get(i);
                supplies[i][1] = list.get(i + N);
            }

            // 按照补给站的远近排序
            Arrays.sort(supplies, (int[] arr1, int[] arr2)->{
                return arr1[0] - arr2[0];
            });

            int left = 0;
            int right = 0;
            int farest = W; // 目前能达到的最远距离
            int result = 0;
            // left（包括）和right（不包括）之间是初始水量能达到的所有补给站
            while (farest < D) {
                // 找到能达到的最远补给站
                left = right;
                while (right < N && supplies[right][0] <= farest) {
                    ++right;
                }
                ++result;
                // 遍历left和right之间所有的水站，查看此次补给能补到的最大水量
                int temp = 0;
                for (int i = left; i < right; ++i) {
                    temp = temp >= supplies[i][1] ? temp : supplies[i][1];
                }
                // 补不到任何水，说明到不了终点
                if (temp == 0) {
                    System.out.println(-1);
                    return;
                }
                farest += temp;
            }
            System.out.println(result);
    }
}
