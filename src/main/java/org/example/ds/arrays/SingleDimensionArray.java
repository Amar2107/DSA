package org.example.ds.arrays;

public class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i=0;i<arr.length;i++)
            arr[i] = Integer.MIN_VALUE;
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;    // ----------> O(1) as we know the physical location  we can jus add
                System.out.println("Value inserted"); //       the index to the location and get the data
            }
            else
                System.out.println("Value already present");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array!!");
        }
    }

    public void printArray()
    {
        for (int i=0;i<this.arr.length;i++)
            System.out.print(this.arr[i]+" ");
    }

}
