package leetcode.graph;

// 图的定义
// 边的信息
public class EdgeElement {
    int fromvex;  // 起点
    int endvex;  // 终点
    int weight;  // 权重

    // 无权重边初始化
    public EdgeElement(int fromvex, int endvex) {
        this.fromvex = fromvex;
        this.endvex = endvex;
        this.weight = 1;
    }

    // 有权重边初始化
    public EdgeElement(int fromvex, int endvex, int weight) {
        this.fromvex = fromvex;
        this.endvex = endvex;
        this.weight = weight;
    }
}
