package org.example.ds.graph.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ALGraph {

    ArrayList<GraphNode> nodeList;

    public ALGraph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdgeBetweenNodes(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    public void printGraph(){
        for(GraphNode i : nodeList){
            System.out.println(i.name+" neighbours ");
            for (GraphNode j: i.neighbours)
                System.out.print(" "+j.name);
            System.out.println();
        }
    }

    public void bfsTraversal(GraphNode graphNode){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(graphNode);
        while (!queue.isEmpty()){
            GraphNode node = queue.remove(0);
            node.isVisited = true;
            System.out.print(" "+node.name);
            ArrayList<GraphNode> neighbors = node.neighbours;
            for (GraphNode node1 : neighbors){
                if(!node1.isVisited) {
                    node1.isVisited = true;
                    queue.add(node1);
                }
            }
        }
    }

    public void bfs(){
        for (GraphNode node : nodeList){
            if(!node.isVisited)
                bfsTraversal(node);
        }
    }


    public void dfsTraversal(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()){
            GraphNode current = stack.pop();
            node.isVisited = true;
            System.out.println("Visited "+current.name);
            ArrayList<GraphNode> nodes = current.neighbours;
            for (GraphNode neighbor : nodes) {
                if(!neighbor.isVisited) {
                    neighbor.isVisited = true;
                    stack.add(neighbor);
                }
            }
        }
    }

    public void dfs(){
        for (GraphNode node: nodeList){
            if (!node.isVisited)
                dfsTraversal(node);
        }
    }


    public void addDirectedEdges(int i, int j){
        GraphNode node1 = nodeList.get(i);
        GraphNode node2 = nodeList.get(j);
        node1.neighbours.add(node2);
    }

    //topological
    public void topLogicalSort(GraphNode node, Stack<GraphNode> stack){
        ArrayList<GraphNode> neighbors = node.neighbours;
        for(GraphNode neighbor : neighbors){
            if(!neighbor.isVisited)
                topLogicalSort(neighbor,stack);
        }
        node.isVisited = true;
        stack.push(node);
    }

    public void topological(){
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node : nodeList){
            if (!node.isVisited)
                topLogicalSort(node,stack);
        }

        while (!stack.empty())
            System.out.println(stack.pop().name);
    }


}
