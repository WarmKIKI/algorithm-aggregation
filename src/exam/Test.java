package exam;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Map map = new HashMap<>();
//        map.put("apple", 1);
//        map.put("pig", 2);
//        Iterator it = map.entrySet().iterator();
//        while(it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
//            entry.getKey();
//            entry.getValue();
//        }
       // topn();
       // topNDesc();
       // topArray();
       // insertSort();
       // ArraysSort();
        int[] nums = new int[]{4, 9, 5, 3, 7, 6, 8, 2, 1};
        int i = 0;
        int j = nums.length - 1;
        quickSort(i, j, nums);
        for (Integer it : nums) {
            System.out.print(it + " ");
        }
    }

    public static void topn() {
        int[] nums = new int[]{3,4,5,6,7,8,4,2,5,66,4,4,6,3,5,6,74,56,5,7,5,7,6,4,3,4,5,4,3};
        // 数组转化为list
        // java 9 新增的方法 List.of(数组) 
        ArrayList<Integer> arrayList = new ArrayList();
        for (Integer it: nums) {
            arrayList.add(it);
        }

        Collections.sort(arrayList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int e : arrayList) {
            System.out.print(e + " ");
        }
    }

    public static void topNDesc() {
        int[] nums = new int[]{3,4,5,6,7,8,4,2,5,66,4,4,6,3,5,6,74,56,5,7,5,7,6,4,3,4,5,4,3};
        // 数组转化为list
        // java 9 新增的方法 List.of(数组)
        ArrayList<Integer> arrayList = new ArrayList();
        for (Integer it: nums) {
            arrayList.add(it);
        }

        Collections.sort(arrayList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("\n");
        for (int e : arrayList) {
            System.out.print(e + " ");
        }
    }

    // 冒泡排序
    public static void topArray() {
        // 二维数组初始化：int arr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
        // int arr[2][2] = {1,2,3,4}；
        // static int arrr[2][3] = {{1,2},{3}}；
        // int arr[][2] = {1,2,3,4}即可等价于 int arr[2][2] = {{1,2},{3,4}}
        int[][] ints = {{5, 9}, {3, 4}, {3, 6}, {3, 1}, {7, 2}};
        for (int i = 0; i < ints.length; i++) {  //
            for (int j = 0; j < ints.length - i -1; j++) {
                if(ints[j][0] > ints[j+1][0]) {
                    int temp = ints[j][0];
                    ints[j][0] = ints[j+1][0];
                    ints[j+1][0] = temp;
                    int tmp = ints[j][1];
                    ints[j][1] = ints[j+1][1];
                    ints[j+1][1] = tmp;
                } else if(ints[j][0] == ints[j+1][0]) {
                    if(ints[j][1] > ints[j+1][1]) {
                        int tmp = ints[j][1];
                        ints[j][1] = ints[j+1][1];
                        ints[j+1][1] = tmp;
                    }
                }
            }
        }
        for (int[] it : ints) {
            System.out.println(it[0] + " " + it[1]);
        }
    }

    // 插入排序
    public static void insertSort() {
        // for(表达式1；表达式2；表达式3) {表达式4}
        // 执行表达式1，然后用表达式2来判定表达式1，执行表达式4，执行表达式3
        int[] nums = new int[]{3,4,5,6,7,8,4,2,5,66,4,4,6,3,5,6,74,56,5,7,5,7,6,4,3,4,5,4,3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        for (Integer it: nums) {
            System.out.print(it + " ");
        }
    }

    public static void ArraysSort() {
        int[] nums = new int[]{3,4,5,6,7,8,4,2,5,66,4,4,6,3,5,6,74,56,5,7,5,7,6,4,3,4,5,4,3};
        Arrays.sort(nums);
        for (Integer it : nums) {
            System.out.print(it + " ");
        }
    }

    // 快速排序
    public static void quickSort(int t, int r, int[] nums) {
        if(r < t) return;
        int temp = nums[t];
        int i = t; int j = r;
        while(i < j) {
            while (nums[j] >= temp && i < j) j--;
            nums[i] = nums[j];
            while (nums[i] <= temp && i < j) i++;
            nums[j] = nums[i];
        }
        nums[i] = temp;
        quickSort(t, i-1, nums);
        quickSort(i+1, r, nums);
    }
}
