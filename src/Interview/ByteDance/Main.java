package Interview.ByteDance;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int typeNum = sc.nextInt();
        Map<String, Set> result = new HashMap<>();
        Map<String, String> input = new HashMap<>();
        for (int i = 0; i < typeNum; i++) {
            String userType = sc.next();
            String model = sc.next();
            input.put(userType, model);
        }
        for (Map.Entry<String, String> e : input.entrySet()) {
            String model = e.getValue();
            if(result.keySet().contains(model)) {
                result.get(model).add(e.getKey());
            } else {
                Set<String> value = new TreeSet<>();
                value.add(e.getKey());
                result.put(e.getValue(), value);
            }
        }
        for (Map.Entry<String, Set> e: result.entrySet()) {
            System.out.print(e.getKey() + " ");
            Set<String> set = e.getValue();
            for (String s: set) {
                System.out.print(s+ " ");
            }
            System.out.println();
        }
    }
}
