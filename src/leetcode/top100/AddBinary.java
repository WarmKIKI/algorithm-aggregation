package leetcode.top100;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer stringBuffer = new StringBuffer();
        int i; int j; int mod = 0; int vod = 0;
        for (i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int tmp = x + y + vod;
            if(tmp > 1) {
                mod = tmp % 2;
                vod = tmp / 2;
                stringBuffer.append(mod);
            } else {
                vod = 0;
                stringBuffer.append(tmp);
            }
        }
        if(vod == 1) {
            stringBuffer.append(vod);
        }
        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String str = addBinary.addBinary("11","1");
        System.out.println(str);
    }
}
