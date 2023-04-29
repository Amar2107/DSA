package org.example.ds.arrays;


public class DoubleDimensionArray {


    int int2DArray[][] = null;

    public DoubleDimensionArray(int row, int col){
        this.int2DArray = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                int2DArray[i][j] = Integer.MIN_VALUE;
        }
    }

    public void insert(int row, int col, int val) {
        try {
            if (int2DArray[row][col] == Integer.MIN_VALUE)
                int2DArray[row][col] = val;
            else
                System.out.println("Data already present in the cell");
        }catch (Exception e) {System.out.println(e.getMessage());}
    }

    public void printArray()
    {
       for(int i=0;i<int2DArray.length;i++)
       {
           for (int j=0; j<int2DArray[0].length;j++)
               System.out.print(int2DArray[i][j]+" ");
           System.out.println();
       }
    }

}
