package leetcode.graph;

public class Graph {
    private int vertexSize; // 顶点数量
    private int[] vertex; // 定义顶点数组
    private int[][] matrix; // 定义邻接矩阵，是一个二维数组
    private static final int MAX = 50; // 设置最大权重50代表无穷大

    //图类的构造
    public Graph(int vertexSize) {
        this.vertexSize = vertexSize;
        matrix = new int[vertexSize][vertexSize];
        vertex = new int[vertexSize];
        for (int i = 0; i < vertexSize; i++) {
            vertex[i] = i;
        }
    }
}
