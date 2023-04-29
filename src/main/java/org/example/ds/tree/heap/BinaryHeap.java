package org.example.ds.tree.heap;

public class BinaryHeap {

    int sizeOfHeap;
    int arr[];

    BinaryHeap(int size){
        arr = new int[size+1];
        sizeOfHeap = 0;
    }

    public int getSizeOfHeap(){
        return sizeOfHeap;
    }

    public boolean isEmpty(){
        return sizeOfHeap == 0;
    }

    public int peek(){
        if (isEmpty())
            return -1;
        else
            return arr[1];
    }

    public void lvlOrder(){
        for(int i =1;i<=sizeOfHeap;i++)
            System.out.println(arr[i]);
    }

    public void inOrder(int index){
        if(index>sizeOfHeap)
            return;
        else{
            inOrder(2*index);
            System.out.println(arr[index]);
            inOrder((2*index )+ 1);
        }
    }

    public int[] swap(int arr[],int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return arr;
    }


    public void heapifyElements(int index,String type) {
        int parent = index / 2;
        if (index <= 1)
            return;

        if (type.equalsIgnoreCase("Min")) {
            if (arr[parent] > arr[index]) {
                swap(arr,parent,index);
            } else if (type.equalsIgnoreCase("Max")) {
                if (arr[parent] < arr[index]) {
                    swap(arr,parent,index);
                }
            }
            heapifyElements(parent, type);
        }
    }

    public void insert(int val, String type){
        arr[sizeOfHeap+1] = val;
        sizeOfHeap++;
        heapifyElements(sizeOfHeap,type);
    }

    public void hepifyFromBottomDelete(int index, String type){
        int left = index*2;
        int right = index*2+1;
        int replace=0;
        if(left>sizeOfHeap)
            return;
        if(type.equalsIgnoreCase("Min")){

            if(left == sizeOfHeap) {
                swap(arr, left, index);
                return;
            }else{
                if(arr[left]>arr[right])
                    replace = right;
                else
                    replace = left;
                if (arr[index]>arr[replace])
                    swap(arr,index,replace);
            }
        }
        else {
            if(left == sizeOfHeap) {
                swap(arr, left, index);
                return;
            }else{
                if(arr[left]<arr[right])
                    replace = right;
                else
                    replace = left;
                if (arr[index]<arr[replace])
                    swap(arr,index,replace);
            }
        }
        heapifyElements(replace,type);
    }

}
