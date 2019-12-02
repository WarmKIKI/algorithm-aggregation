package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

// 简单的无向图节点表示
// 邻接表
public class GraphNode<T> {
    T data;
    List<GraphNode<T>> neighborList;
    boolean visited;

    public GraphNode(T data) {
        this.data = data;
        neighborList = new ArrayList<GraphNode<T>>();
        visited = false;
    }

    public boolean equals(GraphNode<T> node){
        return this.data.equals(node.data);
    }

    public void restoreVisited() {
        restoreVisited(this);
    }

    private void restoreVisited(GraphNode<T> node) {
        if(node.visited) {
            node.visited = false;
        }

        List<GraphNode<T>> neighbors = node.neighborList;
        for (int i = 0; i < neighbors.size(); i++) {
            restoreVisited(neighbors.get(i));
        }
    }
}

