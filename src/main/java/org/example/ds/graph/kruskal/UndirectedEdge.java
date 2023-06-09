package org.example.ds.graph.kruskal;

import org.example.ds.graph.node.WeightedNode;

public class UndirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    public UndirectedEdge(WeightedNode first, WeightedNode second, int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Edge ("+first+" , "+second+"), weight: "+weight;
    }

}
