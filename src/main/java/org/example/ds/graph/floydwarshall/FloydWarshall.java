package org.example.ds.graph.floydwarshall;

import org.example.ds.graph.dijkstra.WeightedGraph;
import org.example.ds.graph.dijkstra.WeightedNode;

import java.util.ArrayList;

public class FloydWarshall extends WeightedGraph {

    public FloydWarshall(ArrayList<WeightedNode> nodeList) {
        super(nodeList);
    }

    public void floydWarshall(){
        int v[][] =new int[nodeList.size()][nodeList.size()];
        for(int i=0;i<nodeList.size();i++)
        {
            WeightedNode first = nodeList.get(i);
            for (int j=0;j< nodeList.size();j++)
            {
                WeightedNode second = nodeList.get(j);
                if(i == j)
                    v[i][j] =0;
                else if(first.weightMap.get(second) != null)
                    v[i][j] = first.weightMap.get(second);
                else
                    v[i][j] = Integer.MAX_VALUE/10;
            }
        }

        int n = nodeList.size();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                for (int k=0;k<n;k++) {
                    if(v[i][j] > v[i][k] + v[k][j])
                        v[i][j] = v[i][k] + v[k][j];
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print("Printing distance for "+nodeList.get(i)+": ");
            for(int j =0 ;j<n;j++)
                System.out.print(v[i][j]+" ");
            System.out.println();
        }


    }

}
