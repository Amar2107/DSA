package org.example.algo.dnc;

public class SortedFrequency {


    public static int leftMostOccurance(int a[], int num){
        int index = 0;
        int l=0,r=a.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid] == num) {
                r = mid;
                index = mid;
            }
            else if(num<a[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return index;
    }

    public static int rightMostOccurance(int a[], int num){
        int index = 0;
        int l=0,r=a.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid] == num) {
                l = mid + 1;
                index = mid;
            }
            else if(num>a[mid])
                l = mid + 1;
            else
                r = mid -1;
        }
        return index;
    }

    public static int sortedFrequency(int[] arr, int num) {
        return rightMostOccurance(arr,num) - leftMostOccurance(arr,num) + 1;
    }

    public static void main(String[] args) {
        System.out.println(sortedFrequency(new int[]{1, 1, 2, 2, 2, 2, 3},2));
        System.out.println(sortedFrequency(new int[]{1, 2, 2, 2, 2, 2,2,2, 3},2));
    }

}
