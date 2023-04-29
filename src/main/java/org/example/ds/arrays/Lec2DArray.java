package org.example.ds.arrays;

public class Lec2DArray {

    public static void main(String[] args) {
        DoubleDimensionArray doubleDimensionArray = new DoubleDimensionArray(2,2);

        doubleDimensionArray.insert(0,0,1);
        doubleDimensionArray.insert(0,1,2);
        doubleDimensionArray.insert(1,0,3);
        doubleDimensionArray.insert(1,1,4);
        doubleDimensionArray.insert(0,0,5);


        doubleDimensionArray.printArray();
    }
}
