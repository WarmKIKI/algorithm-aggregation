package Interview.ByteDance;

import java.util.Scanner;

public class UserPreference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        int[] pefer = new int[userNum+1];
        for (int i = 1; i < userNum+1; i++) {
            pefer[i] = sc.nextInt();
        }
        int sampleNum = sc.nextInt();
        int[][] sampleScale = new int[sampleNum][3];
        for (int i = 0; i < sampleNum; i++) {
            for (int j = 0; j < 3; j++) {
                sampleScale[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < sampleNum; i++) {
            int num = 0;
            int start = sampleScale[i][0];
            int end = sampleScale[i][1];
            int aim = sampleScale[i][2];
            for (int j = start; j <= end; j++) {
                if(pefer[j] == aim) num++;
            }
            System.out.println(num);
        }
    }
}
