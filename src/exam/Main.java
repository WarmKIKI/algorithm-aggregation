package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] ints = new int[n][2];
        for (int i = 0; i < n; i++) {
            ints[i][0] = sc.nextInt();
            ints[i][1] = sc.nextInt();
        }
        System.out.println(n + " " + k);
        for (int i = 0; i < n; i++) {
            System.out.println(ints[i][0] + " " + ints[i][1]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> lowMap = new HashMap<>();
        Map<Integer, Integer> highMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(ints[i][0] <= ints[j][0] && ints[j][0] < ints[i][1] && ints[i][1] <= ints[i][1]) {
                    if(map.getOrDefault(i, 0) == 0) {
                        map.put(i, 2);
                        lowMap.put(i, ints[i][0]);
                        highMap.put(i, ints[j][1]);
                    } else {
                        highMap.put(i, ints[j][1]);
                        map.put(i, map.get(i) + 1);
                    }
                }
            }
        }
        int low = 50;
        int high = -50;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
           if(it.getValue() >= k) {
               int key = it.getKey();
               if(lowMap.get(key) != null && highMap.get(key) != null) {
                   int l = lowMap.get(key);
                   int h = highMap.get(key);
                   if (l <= low && h >= high) {
                       low = l;
                       high = h;
                   }
               }
           }
        }

        if(low == 50 && high == -50) {
            System.out.println("error");
        } else {
            System.out.println(low + " " + high);
        }
    }
}
