package leetcode.design_model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>(); // map的key值会排序
//        map.put("3",1);
//        map.put("2",1);
//        map.put("2",2);
//        map.put("4",4);
//        for (Map.Entry elem : map.entrySet()) {
//            System.out.println(elem.getKey() + " " + elem.getValue());
//        }
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.remove(String.valueOf(3)));
        list.add(0, "3");
        System.out.println(list.get(0));
    }
}
