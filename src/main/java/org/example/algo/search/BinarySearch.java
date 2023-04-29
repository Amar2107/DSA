package org.example.algo.search;

public class BinarySearch {

    public void binarySearch(int a[],int key){

        int l = 0,h = a.length-1, index = -1;

        while(l<=h){
            int mid = (l+h)/2;
            if(key == a[mid]){
                index = mid;
                break;
            } else if (key>a[mid]) {
                l = mid+1;
            }else
                h = mid -1;
        }
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+index);

    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int a[] = {0,1,4,5,6,7,8,9,12,24,67};
        bs.binarySearch(a,67);
    }

}
