package org.example.ds.graph.dijkstra;

import org.example.ds.graph.node.WeightedNode;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {

    public ArrayList<WeightedNode> nodeList;

    public WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedDirectionNode(int i, int j, int d){
        WeightedNode node1 = nodeList.get(i);
        WeightedNode node2 = nodeList.get(j);
        node1.neighbors.add(node2);
        node1.weightMap.put(node2,d);
    }

    public void dijsktra(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.add(node);
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()){
            WeightedNode current = queue.remove();
            for (WeightedNode neighbor: current.neighbors){
                if(queue.contains(neighbor)){
                    if (neighbor.distance > current.distance + current.weightMap.get(neighbor)) {
                        neighbor.distance = current.distance + current.weightMap.get(neighbor);
                        neighbor.parent = current;
                        queue.remove(); // remove and add to refresh the priority queue
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck: nodeList){
            System.out.print("Node "+nodeToCheck.name+", distance: "+nodeToCheck.distance+" Path: ");
            pathToPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void pathToPrint(WeightedNode node) {
        if(node.parent!= null)
            pathToPrint(node.parent);
        System.out.print(node.name+" ");
    }




}
