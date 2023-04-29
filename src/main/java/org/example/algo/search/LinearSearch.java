package org.example.algo.search;

public class LinearSearch {

    public void linearSearch(int a[], int key){

        int n = a.length;
        int index = -1;
        for(int i=0;i<=n-1;i++) {
            if(key == a[i]){
                index = i;
                break;
            }
        }
        if(index == -1)
            System.out.println("Key not present in the array");
        else
            System.out.println("Key present "+index);

    }


    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int a[] = {0,1,24,5,6,7,8,9,12,4,67};
        ls.linearSearch(a,67);
    }

}
