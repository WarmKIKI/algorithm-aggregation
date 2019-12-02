package leetcode.other;

import java.util.HashMap;

public class Robot {
    public static void main(String[] args) {
        System.out.println(robot("URR", new int[][]{{2,2}}, 3,2 ));
    }
    public static boolean robot(String command, int[][] obstacles, int x, int y) {
        int aimx = 0;
        int aimy = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < obstacles.length; i++) {
            map.put(obstacles[i][0], obstacles[i][1]);
        }
        while (true) {
            int i;
            for (i = 0; i < command.length(); i++) {
                  if('U' == command.charAt(i)) {
                      aimy++;
                  } else if('R' == command.charAt(i)) {
                      aimx++;
                  }
                  if(map.get(aimx) != null) {
                    if(map.get(aimx) == aimy) {
                        return false;
                    }
                  }
                  if(aimx > x || aimy > y) {
                    return false;
                  }
                  if(x == aimx && y == aimy) {
                      return true;
                  }
            }
        }
    }
}
