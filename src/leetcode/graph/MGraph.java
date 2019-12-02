package leetcode.graph;

// 邻接矩阵表示法
public class MGraph {
    int vexs; // 图中的节点数
    char data[]; // 存放节点数据
    int[][] weight; // 存放边
    boolean[] visit; // 记录节点是否访问过

    public MGraph(int vexs) {
        this.vexs = vexs;
        this.data = new char[vexs];
        this.weight = new int[vexs][vexs];
    }
}

