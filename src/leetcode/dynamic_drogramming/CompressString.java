package leetcode.dynamic_drogramming;

public class CompressString {
    public String compressString(String S) {
        if(S.equals("")) return S;
        StringBuffer str = new StringBuffer();
        int num = 1, i = 0;
        while (i < S.length()-1) {
            if(S.charAt(i)==S.charAt(i+1)) {
                num++;
            } else {
                str.append(S.charAt(i)).append(num);
                num = 1;
            }
            i++;
        }
        str.append(S.charAt(i)).append(num);
        String result = str.toString();
        if(result.length() > S.length()) return S;
        else return result;
    }

    public static void main(String[] args) {
        CompressString comStr = new CompressString();
        comStr.compressString("aabcccccaa");
    }
}
