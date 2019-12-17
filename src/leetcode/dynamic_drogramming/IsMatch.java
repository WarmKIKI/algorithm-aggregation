package leetcode.dynamic_drogramming;

// '?' 匹配任意单个字符
// '*' 匹配零个或多个前面的那一个元素
// 通配符匹配
public class IsMatch {
    public boolean isMatch(String s, String p) {
        int sn = s.length();
        int pn = p.length();
        int i = 0;  // s的当前指针
        int j = 0;  // p的当前指针
        int start = -1;
        int match = 0;

        while (i < sn)
        {
            if (j < pn && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'))
            {
                i++;
                j++;
            }
            else if (j < pn && p.charAt(j) == '*')
            {
                start = j;
                match = i;
                j++;
            }
            else if (start != -1)
            {
                j = start + 1;
                i = ++match;
            }
            else
            {
                return false;
            }
        }

        while (j < pn)
        {
            if (p.charAt(j) != '*')
                return false;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        IsMatch isMatch = new IsMatch();
        System.out.println(isMatch.isMatch("aaccb", "a*c?b"));
    }
}
