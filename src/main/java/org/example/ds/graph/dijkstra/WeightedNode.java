package org.example.ds.graph.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeightedNode implements Comparable<WeightedNode>{

    public String name;
    public int index;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public Map<WeightedNode,Integer> weightMap = new HashMap<>();
    public WeightedNode parent;
    public int distance;

    public WeightedNode(String name, int index){
        this.name = name;
        this.index = index;
        this.parent = null;
        this.distance = Integer.MAX_VALUE;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
