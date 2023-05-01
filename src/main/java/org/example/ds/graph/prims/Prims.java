package org.example.ds.graph.prims;

import org.example.ds.graph.dijkstra.WeightedNode;
import org.example.ds.graph.kruskal.UndirectedEdge;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {

    ArrayList<WeightedNode> nodeList = new ArrayList<>();


    Prims(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }


    public void addUndirectedWeightedEdge(int index1, int index2, int weight){
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(index1), nodeList.get(index2), weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second,weight);
        second.weightMap.put(first,weight);
    }

    public void prims(WeightedNode node) {
        for (int i = 0; i < nodeList.size(); i++)
            nodeList.get(i).distance = Integer.MAX_VALUE;
        node.distance = 0;

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode current = queue.remove();
            for (WeightedNode neighbor : current.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > current.weightMap.get(neighbor)) {
                        neighbor.distance = current.weightMap.get(neighbor);
                        neighbor.parent = current;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node "+nodeToCheck + " Cost: " + nodeToCheck.distance + " Parent: " + nodeToCheck.parent);
            cost += nodeToCheck.distance;
        }
        System.out.println("Total cost of MST "+cost);
    }

}
