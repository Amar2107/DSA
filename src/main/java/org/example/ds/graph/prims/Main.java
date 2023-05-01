package org.example.ds.graph.prims;

import org.example.ds.graph.node.WeightedNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A",0));
        nodeList.add(new WeightedNode("B",1));
        nodeList.add(new WeightedNode("C",2));
        nodeList.add(new WeightedNode("D",3));
        nodeList.add(new WeightedNode("E",4));

        Prims graph = new Prims(nodeList);
        graph.addUndirectedWeightedEdge(0,1,5);
        graph.addUndirectedWeightedEdge(0,2,13);
        graph.addUndirectedWeightedEdge(0,4,15);
        graph.addUndirectedWeightedEdge(1,2,10);
        graph.addUndirectedWeightedEdge(1,3,8);
        graph.addUndirectedWeightedEdge(2,3,6);
        graph.addUndirectedWeightedEdge(2,4,20);

        System.out.println("Running {Prims} algo");

        graph.prims(graph.nodeList.get(4));

    }
}
