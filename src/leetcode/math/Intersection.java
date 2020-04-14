package leetcode.math;

public class Intersection {
    public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        double[] result = new double[0];
        double k1 , b1 = 0.0,k2, b2 = 0.0;
        //计算第一条线段的k和b
        int lapx1 = end1[0] - start1[0];
        int lapy1 = end1[1] - start1[1];
        if(end1[0] == 0 && start1[0] == 0) k1 = 1.0;
        else {
            k1 = lapy1 * 1.0 / lapx1;
            b1 = start1[1] - k1 * start1[0];
        }
        //计算第二条线段的k和b
        int lapx2 = end2[0] - start2[0];
        int lapy2 = end2[1] - start2[1];
        if(end2[0] == 0 && start2[0] == 0) k2 = 1.0;
        else {
            k2 = lapy2*1.0 / lapx2;
            b2 = start2[1] - k2*start2[0];
        }
        // 平行
        if(k1 == k2) {
            // 重叠
            if((k1*start2[0] + b1 == start2[1] || (b1 == 0.0 && b2 == 0.0))) {
                if (judge(start1[1], end1[1], start2[1]) && judge(start2[1], end2[1], end1[1])) {
                    result =evaluation(start2[0], start2[1]);
                } else if (judge(start1[1], end1[1], start2[1]) && judge(start1[1], end1[1], end2[1])) {
                    result =evaluation(start2[0], start2[1]);
                } else if (judge(start2[1], end2[1], start1[1]) && judge(start1[1], end1[1], end2[1])) {
                    result =evaluation(start1[0], start1[1]);
                } else if (judge(start2[1], end2[1], start1[1]) && judge(start2[1], end2[1], end1[1])) {
                    result =evaluation(start1[0], start1[1]);
                }
            }
            return result;
        }
        // 不平行必相交
        double x = (b1+b2) / (k1-k2);
        double y = k1 * x + b1;
        // 交点是否在两线段之间
        if(judge(start1[0], end1[0], x) && judge(start1[1], end1[1], y) && judge(start2[0], end2[0], x) && judge(start2[1], end2[1], y)) {
            result = evaluation(x, y);
        }
        return result;
    }

    public double[] evaluation(double x, double y) {
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;
        return  result;
    }

    // 判断一个数是否在两个值的区间内
    public boolean judge(int num1, int num2, double value) {
        if(num1 < num2) {
            if(value <= num2 && value>= num1) {
                return true;
            }
        } else {
            if(value >= num2 && value <= num1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        intersection.intersection(new int[]{0,0}, new int[]{1,1},new int[]{1,0},new int[]{2,1});
    }
}
