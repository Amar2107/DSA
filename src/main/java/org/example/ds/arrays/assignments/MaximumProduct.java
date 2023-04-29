package org.example.ds.arrays.assignments;

public class MaximumProduct {

    private static String max2Prod(int[] a) {
        int max1=0;
        int max2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2)
                max2 = a[i];

        }
        return max1+","+max2;
    }

    public static void main(String[] args) {
        int a[] = {3,4,5,2};
        System.out.println(max2Prod(a));
    }


}
