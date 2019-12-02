package leetcode.graph;

import java.util.*;

public class SearchGraph<T> {
    StringBuffer  searchDFS = new StringBuffer();
    StringBuffer searchBFS = new StringBuffer();

    public void searchDFS(GraphNode<T> root) {
        if(root == null)
            return;

        if(searchDFS.length() > 0) {
            searchDFS.append("->");
        }
        root.visited = true;
        searchDFS.append(root.data.toString());

        for (GraphNode<T> node : root.neighborList) {
            if(!node.visited) {
                searchDFS(node);
            }
        }
    }

    public void setSearchBFS(GraphNode<T> root) {
        Queue queue = new LinkedList();
        queue.add(root);
        searchBFS.append(root.data.toString());
        while(!queue.isEmpty()) {
            GraphNode<T> node = (GraphNode<T>) queue.poll();
            for (GraphNode<T> elem : node.neighborList) {
                    if(!elem.visited) {
                        searchBFS.append("->");
                        searchBFS.append(elem.data.toString());
                        elem.visited = true;
                        queue.add(elem);
                    }
            }
        }
    }

    public GraphNode setup() {
        GraphNode root = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);

        List<GraphNode> neighborList = Arrays.asList(node1, node2, node3, node4);
        root.neighborList = neighborList;
        List<GraphNode> neighborList2 = Arrays.asList(node4, node5);
        node1.neighborList = neighborList2;
        List<GraphNode> neighborList3 = Arrays.asList(node1, node4);
        node3.neighborList = neighborList3;
        return root;
    }

    public static void main(String[] args) {
        SearchGraph searchGraph = new SearchGraph();
        GraphNode root = searchGraph.setup();
        searchGraph.searchDFS(root);
        System.out.println(searchGraph.searchDFS);
        GraphNode root1 = searchGraph.setup();
        searchGraph.setSearchBFS(root1);
        System.out.println(searchGraph.searchBFS);
    }
}
