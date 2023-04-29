package org.example.ds.graph.list;

import java.util.ArrayList;

public class GraphNode {

    public int index;
    public String name;
    public GraphNode parent;
    public boolean isVisited = false;
    public ArrayList<GraphNode> neighbours = new ArrayList<>();

    GraphNode(int i, String name){
        this.index = i;
        this.name = name;
        this.parent = null;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }



}
