package org.example.ds.graph.matrix;

import org.example.ds.graph.list.ALAdvanced;

import java.util.ArrayList;

public class AMAMain {

    public static void main(String[] args) {
        ArrayList<GraphNode> al = new ArrayList<>();
        al.add(new GraphNode("A",0));
        al.add(new GraphNode("B",1));
        al.add(new GraphNode("C",2));
        al.add(new GraphNode("D",3));
        al.add(new GraphNode("E",4));
        al.add(new GraphNode("F",5));
        al.add(new GraphNode("G",6));

        AMAdvanced graph = new AMAdvanced(al);

        /*
            A ---------B\
            |          | \
            |          |  \
            C----------D   G
            |          |  /
            |          | /
            E----------F/
        * */

        graph.addUndirectedGraph(0,1);
        graph.addUndirectedGraph(0,2);
        graph.addUndirectedGraph(1,3);
        graph.addUndirectedGraph(1,6);
        graph.addUndirectedGraph(2,3);
        graph.addUndirectedGraph(2,4);
        graph.addUndirectedGraph(3,5);
        graph.addUndirectedGraph(4,5);
        graph.addUndirectedGraph(5,6);

        graph.SSSPP(graph.nodeList.get(0));

    }
}
