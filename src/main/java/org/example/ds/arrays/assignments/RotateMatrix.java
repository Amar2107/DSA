package org.example.ds.arrays.assignments;

public class RotateMatrix {

    private static void rotate90(int[][] mat) {

        int n = mat.length;
        for(int i=0;i<(n+1)/2;i++)
        {
            for (int j=0;j<n/2;j++)
            {
                //bottom left
                int temp = mat[n-1-j][i];
                mat[n-1-j][i] = mat[n-1-i][n-j-1]; //bottom left = bottom right
                mat[n-1-i][n-j-1] = mat[j][n-1-i];// bottom right = top right
                mat[j][n-1-i] = mat[i][j]; // top right = top left
                mat[i][j] = temp; //  top left = bottom lest
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

        System.out.println();
        System.out.println();
        rotate90(mat);
    }


}
