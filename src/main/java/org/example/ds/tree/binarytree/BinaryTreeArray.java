package org.example.ds.tree.binarytree;

public class BinaryTreeArray {

    String arr[];
    int lastUsedIndex;

    BinaryTreeArray(int size){
        this.arr = new String[size+1];
        this.lastUsedIndex = 0;
    }

    boolean isFull(){
        return lastUsedIndex == arr.length-1;
    }

    public void insert(String data){
        if(isFull()) {
            System.out.println("The BT is full");
            return;
        }else{
            arr[lastUsedIndex+1] = data;
            lastUsedIndex++;
        }
    }

    public void preOrder(int index){
        if(index>lastUsedIndex)
            return;
        else{
            System.out.println(arr[index]);
            preOrder(2*index);
            preOrder((2*index )+ 1);
        }
    }

    public void inOrder(int index){
        if(index>lastUsedIndex)
            return;
        else{
            inOrder(2*index);
            System.out.println(arr[index]);
            inOrder((2*index )+ 1);
        }
    }

    public void postOrder(int index){
        if(index>lastUsedIndex)
            return;
        else{
            postOrder(2*index);
            postOrder((2*index )+ 1);
            System.out.println(arr[index]);

        }
    }

    public void lvlOrder(){
       for(int i=1;i<=lastUsedIndex;i++)
           System.out.println(arr[i]);
    }

    public int search(String data){
        for(int i=1;i<=lastUsedIndex;i++){
            if(data.equals(arr[i]))
                return i;
             }
        return -1;
    }

    public void deleteElem(String value){
        int i = search(value);
        arr[i] = arr[lastUsedIndex];
        lastUsedIndex --;
    }

    public void delteBT(){
        arr = null;
    }

}
