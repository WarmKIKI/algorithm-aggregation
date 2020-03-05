package leetcode.other;

public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int count = 0, i = 0;
        int[] result = new int[num_people];
        while(candies != 0) {
            count++;
            if(i == num_people) i=0;
            if(count > candies) {
                result[i++] += candies;
                break;
            }
            result[i++] += count;
            candies -= count;
        }
        return result;
    }

    public static void main(String[] args) {
        DistributeCandies db = new DistributeCandies();
        db.distributeCandies(10, 3);
    }
}
