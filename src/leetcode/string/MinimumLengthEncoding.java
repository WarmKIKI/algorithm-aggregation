package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class MinimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        int count = 0;
        List<String> list = new ArrayList<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            list.add(words[i]);
        }
        int i = 0;
        boolean flag = false;
        int size = list.size();
        while(i < size){
            String aim = list.get(i);
            for(int j = i+1;j < size; j++) {
                String compare = list.get(j);
                int k;
                if ((k = compare.indexOf(aim)) != -1) {
                    if (compare.substring(k).equals(aim)) {
                        list.remove(aim);
                        flag = true;
                        size--;
                        j--;
                    }
                } else if ((k = aim.indexOf(compare)) != -1) {
                    if (aim.substring(k).equals(compare)) {
                        list.remove(compare);
                        size--;
                        j--;
                    }
                }
            }
            if(flag == false) i++;
            else flag = false;
        }
        for (String elem : list) {
            count += elem.length()+1;
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumLengthEncoding min = new MinimumLengthEncoding();
        int value = min.minimumLengthEncoding(new String[]{"time","me","bell","tall"});
        System.out.println(value);
    }
}
