package leetcode.array;

public class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String value = new String();
        String[] wordes = s.split(" ");
        for (int i = wordes.length - 1; i >= 0 ; i--) {
            if(!wordes[i].isEmpty()) {
                value += wordes[i] + " ";
            }
        }
        return value.trim();
    }

    public static void main(String[] args) {
        ReverseWords words = new ReverseWords();
        System.out.println(words.reverseWords("a good   example"));
    }
}
