package org.example.ds.graph.bellman;

import org.example.ds.graph.dijkstra.WeightedGraph;
import org.example.ds.graph.dijkstra.WeightedNode;

import java.util.ArrayList;

public class BellmanFord extends WeightedGraph {

    public BellmanFord(ArrayList<WeightedNode> nodeList) {
        super(nodeList);
    }

    public void bellMan(WeightedNode sourceNode){
        sourceNode.distance = 0;
        for (int i=0;i<nodeList.size();i++) {
            for (WeightedNode node : nodeList) {
                for (WeightedNode neighbor : node.neighbors) {
                    if(neighbor.distance > node.distance + node.weightMap.get(neighbor)){
                        neighbor.distance = node.distance + node.weightMap.get(neighbor);
                        neighbor.parent = node;
                    }
                }
            }
        }

        System.out.println("Checking for negative node");

        for (WeightedNode node : nodeList) {
            for (WeightedNode neighbor : node.neighbors) {
                if(neighbor.distance > node.distance + node.weightMap.get(neighbor)){
                    System.out.println("Negative cycle found ");
                    System.out.println("Vertex name "+neighbor.name);
                    System.out.println("Old cost"+neighbor.distance);
                    System.out.println("new  cost"+node.distance + node.weightMap.get(neighbor));
                    return;
                }
            }
        }

        for (WeightedNode nodeToCheck: nodeList){
            System.out.print("Node "+nodeToCheck.name+", distance: "+nodeToCheck.distance+" Path: ");
            pathToPrint(nodeToCheck);
            System.out.println();
        }
    }

}
