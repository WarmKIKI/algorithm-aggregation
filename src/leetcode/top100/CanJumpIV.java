package leetcode.top100;

public class CanJumpIV {
    public int minJumps(int[] arr) { // 6, 1, 9
        int count = 0;
        if(arr.length == 1) return 0;
        int i = 0;
        while (i < arr.length) {
           int X = find(arr, i);
           if(X == arr.length - 1) break;
           int Y = find(arr, i-1);
           int flag = X >= Y ? X : Y;
           if(flag != -1) {
               count++;
               i = flag;
               continue;
           } else {
               count++;
           }
           i++;
        }
        return count + 1;
    }

    public int find(int[] arr, int i) {
        if(i >= 0 && i < arr.length) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CanJumpIV can = new CanJumpIV();
        int result = can.minJumps(new int[]{6,1,9});
        System.out.println(result);
    }

}
