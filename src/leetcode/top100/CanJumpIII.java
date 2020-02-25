package leetcode.top100;

public class CanJumpIII {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new  boolean[arr.length];
        return find(arr, start, visited);
    }

    private boolean find(int[] arr, int start, boolean[] visited) {
        if(start >= arr.length || start < 0) return false;
        if(visited[start] == true) return false;
        if(arr[start] == 0) return true;
        else {
            visited[start] = true;
            return find(arr, start + arr[start], visited)
                    || find(arr, start - arr[start], visited);
        }
    }

    public static void main(String[] args) {
        CanJumpIII can = new CanJumpIII();
        boolean bool = can.canReach(new int[]{3,0,2,1,2}, 2);
        System.out.println(bool);
    }
}
