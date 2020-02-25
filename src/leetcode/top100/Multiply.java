package leetcode.top100;

public class Multiply {
    public String multiply(String num1, String num2) {
        double value = Integer.valueOf(num1) * Integer.valueOf(num2);
        String result = String.valueOf(value);
        result = result.substring(0, result.indexOf('.'));
        return result;
    }
}
