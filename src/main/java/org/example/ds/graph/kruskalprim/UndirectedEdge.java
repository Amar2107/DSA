package org.example.ds.graph.kruskalprim;

import org.example.ds.graph.dijkstra.WeightedNode;

public class UndirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    UndirectedEdge(WeightedNode first, WeightedNode second, int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Edge ("+first+" , "+second+"), weight: "+weight;
    }

}
