package org.example.ds.graph.matrix;

public class GraphNode {

    public String name;
    public int index;
    public GraphNode parent;
    private boolean visited;

    GraphNode(String name, int index){
        this.name = name;
        this.index = index;
        this.parent = null;
    }

    public void setVisited(boolean v){
        this.visited = v;
    }

    public boolean getVisited(){
        return visited;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }

}
