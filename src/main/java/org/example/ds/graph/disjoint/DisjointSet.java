package org.example.ds.graph.disjoint;

import org.example.ds.graph.dijkstra.WeightedNode;

import java.util.ArrayList;

public class DisjointSet {

    ArrayList<WeightedNode> setList = new ArrayList<>();

    public void makeSet(ArrayList<WeightedNode> nodeList){
        for (WeightedNode node: nodeList){
            DisjointSet set = new DisjointSet();
            setList.add(node);
            node.set = set;
        }
    }

    public DisjointSet findSet(WeightedNode node){
        return node.set;
    }

    public DisjointSet populate(DisjointSet set1, DisjointSet set2){
        for (WeightedNode node: set2.setList){
            node.set = set1;
            set1.setList.add(node);
        }
        return set1;
    }

    public DisjointSet union(WeightedNode node1, WeightedNode node2){
        if (node1.set.equals(node2.set))
            return null;
        else{
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if (set1.setList.size() > set2.setList.size()){
                set1 = populate(set1,set2);
                return set1;
            }else
                set2 = populate(set2,set1);
            return set2;
        }
    }



}
