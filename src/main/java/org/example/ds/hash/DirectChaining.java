package org.example.ds.hash;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxSize = 5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    public int modHashFunction(String word, int m){
        int total=0;
        for(int i=0;i<word.length();i++)
        {
            total += word.charAt(i);
        }
        return total%m;
    }

    public void insert(String wrd){
        int index = modHashFunction(wrd,hashTable.length);
        if(hashTable[index] == null){
            hashTable[index] = new LinkedList<String>();
            hashTable[index].add(wrd);
        }
        else{
            hashTable[index].add(wrd);
        }
    }

    public void printTable(){
        for(int i=0;i<hashTable.length;i++)
            System.out.println("index "+i+" key: "+hashTable[i]);
    }

    public boolean search(String wrd){
    int index = modHashFunction(wrd,hashTable.length);
    if(hashTable[index] != null && hashTable[index].contains(wrd)) {
        System.out.println(wrd+" found at location "+index);
        return true;
    }
    else
        return false;
    }

    public boolean delete(String wrd){
        int index = modHashFunction(wrd,hashTable.length);
        if (hashTable[index] != null && hashTable[index].contains(wrd)) {
            if(hashTable[index].size()>1)
                hashTable[index].remove(wrd);
            else
                hashTable[index] = null;
            return true;
        }
        else {
            System.out.println("Word not present in the hashtable");
            return false;
        }
    }

}
