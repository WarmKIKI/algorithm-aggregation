package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphMetrix {
    //  创建图的邻接矩阵
    public void CreateGraph(MGraph graph, int vexs, char data[], int[][] weight){
        graph.visit = new boolean[vexs];
        for (int i = 0; i < vexs; i++) {
            graph.data[i] = data[i];
            graph.visit[i] = false;
            for (int j = 0; j < vexs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    //获取当前节点K的第一个邻接顶点的位置
    public int GetFirst(MGraph graph, int k) {
        if(k < 0 || k > graph.vexs -1) {
            return -1;
        }
        for (int i = 0; i < graph.vexs; i++) {
            if(graph.weight[k][i] == 1) {
                return i;
            }
        }
        return -1;
    }

    // 获取当前节点K的第t个邻接顶点下一个邻接顶点的位置
    public int GetNext(MGraph graph, int k, int t) {
        if(k < 0 || k > graph.vexs - 1 || t < 0 || t > graph.vexs -1) {
            return -1;
        }
        for (int i = t+1; i < graph.vexs; i++) {
            if(graph.weight[k][i] == 1) {
                return i;
            }
        }
        return -1;
    }

    // 递归方式深度遍历图的邻接矩阵, k表示图的起始点
    public void DFSGraph(MGraph graph, int k) {
        graph.visit[k] = true;
        System.out.print(graph.data[k] + " ");
        int u = GetFirst(graph, k);
        while(u != -1) {
            if(graph.visit[u] == false) {
                DFSGraph(graph, u);
            }
            u = GetNext(graph, k, u);
        }
    }

    // 递归方式广度优先遍历邻接矩阵
    public void BFSGraph(MGraph graph, int k) {
        Queue<Integer> queue = new LinkedList();
        if(graph.visit[k] == false) {
            graph.visit[k] = true;
            queue.add(k);
        }
        while(!queue.isEmpty()) {
            k = queue.poll();
            System.out.print(graph.data[k] + " ");
            int u = GetFirst(graph, k);
            while(u != -1) {
                if(graph.visit[u] == false) {
                    graph.visit[u] = true;
                    queue.add(u);
                }
                u = GetNext(graph, k, u);
            }
        }
    }

    public static void main(String[] args) {
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E'};
        int vexs = data.length;
        int[][] weight = new int[][] {
                {0,1,0,0,1},
                {1,0,1,1,0},
                {0,1,0,0,0},
                {0,1,0,0,1},
                {1,0,0,1,0}
        };

        MGraph graph = new MGraph(vexs);
        GraphMetrix graphMetrix = new GraphMetrix();
        graphMetrix.CreateGraph(graph, vexs, data, weight);
        graphMetrix.DFSGraph(graph, 0);
        graphMetrix.BFSGraph(graph, 0);
    }
}
