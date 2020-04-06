package leetcode.design_model;

import java.util.*;
// leetcode 460 LFU缓存
public class LFUCache {
    int capacity = 0;
    Map<Integer,Integer> count = new HashMap<>();
    Map<Integer, Integer> map = new HashMap<>();
    List<String> list = new LinkedList<>();
    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key) && capacity != 0) {
            list.remove(String.valueOf(key));
            list.add(list.size(), String.valueOf(key));
            count.put(key, count.get(key) + 1);
            return map.get(key);
        }
        else return -1;
    }

    public void put(int key, int value) {
        if(map.size() != 0 && map.size() == capacity && !map.containsKey(key)) {
            int index = getMin();
            count.remove(index);
            map.remove(index);
        }
        if(list.remove(String.valueOf(key))) count.put(key, count.get(key) + 1);
        else count.put(key, 1);
        list.add(String.valueOf(key));
        map.put(key, value);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        List temp = new ArrayList();
        for (Map.Entry<Integer, Integer> elem : count.entrySet()) {
            if(elem.getValue() < min) {
                min = elem.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> elem : count.entrySet()) {
            if(elem.getValue() == min) {
                temp.add(elem.getKey());
            }
        }
        return resent(temp);
    }

    public int resent(List<Integer> temp) {
        int index = Integer.MAX_VALUE;
        int key = 0, k = 0;
        while(k != temp.size()) {
            int value = temp.get(k);
            int tmp = list.indexOf(String.valueOf(value));
            if(index > tmp) {
                index = tmp;
                key = value;
            }
            k++;
        }
        list.remove(index);
        return key;
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(3);
        lfuCache.put(2,6);
        lfuCache.put(1,5);
        lfuCache.put(4,2);
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(2));
        lfuCache.put(3,3);
        System.out.println(lfuCache.get(3));
       // lfuCache.put(4,4);
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(2));
      //  System.out.println(lfuCache.get(4));
    }
}
