package leetcode.top100;

// 每日温度：重新生成的列表是：该位置的输入是需要多少天后的温度可以超过当前位置的温度的天数差
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(T[i] < T[j]) {
                    tmp[i] = j - i;
                    break;
                }
            }
        }
        return tmp;
    }
}
