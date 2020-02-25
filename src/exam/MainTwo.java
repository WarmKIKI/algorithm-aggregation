package exam;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ints = new int[n][2];
        for (int i = 0; i < n; i++) {
            ints[i][0] = sc.nextInt();
            ints[i][1] = sc.nextInt();
        }

        int flag = n;
        int count = 0;
        while(n > 0) {
            flag = flag - m;
            count++;
            for (int i = 0; i < n; i++) {
                ints[i][0] = ints[i][0] - count * ints[i][1];
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n-i; j++) {
                    if(ints[i][0] > ints[j][0]) {

                    }
                }
            }
        }
    }
}
