package org.example.ds.graph.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AMGraph {

    ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    AMGraph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedGraph(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public ArrayList<GraphNode> getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int index = node.index;
        for(int i=0;i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[index][i] == 1)
                neighbors.add(nodeList.get(i));
        }
        return neighbors;
    }


    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty())
        {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.println("Visited "+currentNode.name);
            ArrayList<GraphNode> neighbours = getNeighbors(currentNode);
            for(GraphNode neighbour: neighbours) {
                if (!neighbour.getVisited()) {
                    queue.add(neighbour);
                    neighbour.setVisited(true);
                }
            }
        }
    }

    void bfs(){
        for (GraphNode node : nodeList)
            if(!node.getVisited())
                bfsVisit(node);
    }

    public void dfsTraversal(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.add(node);
        while(!stack.empty()){
            GraphNode current = stack.pop();
            current.setVisited(true);
            System.out.println("Visited "+current.name);
            ArrayList<GraphNode> neighbors = getNeighbors(current);
            for(GraphNode neighbor : neighbors){
                if(!neighbor.getVisited()) {
                    neighbor.setVisited(true);
                    stack.add(neighbor);
                }
            }
        }
    }

    public void dfs(){
        for (GraphNode i : nodeList ) {
            if(!i.getVisited())
                dfsTraversal(i);
        }
    }


    public void topologicalSort(GraphNode node){
        ArrayList<GraphNode> neighbors = getNeighbors(node);
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode neighbor : neighbors){
            topologicalSort(neighbor);
        }
        stack.push(node);
        node.setVisited(true);
    }

    public void topological(){
        for(GraphNode node : nodeList) {
            if (!node.getVisited())
                topologicalSort(node);
        }
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}
