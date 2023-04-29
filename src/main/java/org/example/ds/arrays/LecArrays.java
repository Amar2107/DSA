package org.example.ds.arrays;

/*
Arrays are data structures that hold data of similar data structure in a contiguous manner
array are non-dynamic and have fixed length
elements can be accessed with the help of index that they are stored at

When creating an array: Declare(reference for the array) instantiate(allocates contiguous memory for data[value 0 for int type])
and then initialize(replaces the empty memory blocks with values)

declare: creates a space to hold the reference value of the first cell of the array
  []
  arr
instantiate: contiguous memory locations are allocated for the array populated with default values
and the reference value is populated(declaration cell)
                [ 0  |  0  | 0   |  0  |  0  |  0  |  0  ]
                x11  x11+1 x11+2 ...............x11+n (contiguous)
         [x11]
         arr
initialization: replaces the default values with the user given values
 */



public class LecArrays {


    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        singleDimensionArray.insert(0,13);
        singleDimensionArray.insert(1,435);
        singleDimensionArray.insert(3,65);
        singleDimensionArray.insert(4,234);
        singleDimensionArray.insert(5,76);
        singleDimensionArray.insert(6,3);
        singleDimensionArray.insert(7,678);
        singleDimensionArray.insert(8,436);
        singleDimensionArray.insert(2,74);
        singleDimensionArray.insert(1,76);
        singleDimensionArray.insert(9,345);
        singleDimensionArray.insert(11,65);

        singleDimensionArray.printArray();

        var first =singleDimensionArray.arr[0]; // ----> O(1) because we know the physical location of the array
                                                //             we can just add the index to the location and retrieve the data
        System.out.println(first);
        var third = singleDimensionArray.arr[2]; // ----> O(1)


        System.out.println(first);
        System.out.println(third);
        try {
            var outOfBound = singleDimensionArray.arr[23];
            System.out.println(outOfBound);
        }catch (Exception e){System.out.println(e.getMessage());}

    //space complexity is 1

    }



}
