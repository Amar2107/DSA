package org.example.ds.graph.list;

import java.util.ArrayList;

public class ALAMain {

    public static void main(String[] args) {
        ArrayList<GraphNode> al = new ArrayList<>();
        al.add(new GraphNode(0,"A"));
        al.add(new GraphNode(1,"B"));
        al.add(new GraphNode(2,"C"));
        al.add(new GraphNode(3,"D"));
        al.add(new GraphNode(4,"E"));
        al.add(new GraphNode(5,"F"));
        al.add(new GraphNode(6,"G"));

        ALAdvanced graph = new ALAdvanced(al);

        /*
            A ---------B\
            |          | \
            |          |  \
            C----------D   G
            |          |  /
            |          | /
            E----------F/
        * */

        graph.addUndirectedEdgeBetweenNodes(0,1);
        graph.addUndirectedEdgeBetweenNodes(0,2);
        graph.addUndirectedEdgeBetweenNodes(1,3);
        graph.addUndirectedEdgeBetweenNodes(1,6);
        graph.addUndirectedEdgeBetweenNodes(2,3);
        graph.addUndirectedEdgeBetweenNodes(2,4);
        graph.addUndirectedEdgeBetweenNodes(3,5);
        graph.addUndirectedEdgeBetweenNodes(4,5);
        graph.addUndirectedEdgeBetweenNodes(5,6);

        graph.SSSPPTravel(graph.nodeList.get(0));



    }
}
