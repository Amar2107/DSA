package org.example.ds.hash;

import java.util.ArrayList;

public class LinearProbing {

    String[] hashTable;
    int counter;

    LinearProbing(int size){
        hashTable = new String[size];
        counter =0;
    }

    public double loadFactor(){
        return counter* 1.0/hashTable.length;
    }

    public int modHashFunction(String word, int m){
        int total=0;
        for(int i=0;i<word.length();i++)
        {
            total += word.charAt(i);
        }
        return total%m;
    }

    public void rehash(String word){
        ArrayList<String> data = new ArrayList<>();

        for (String s: hashTable) {
            if(s!=null)
                data.add(s);
        }

        data.add(word);
        hashTable = new String[hashTable.length*2];
        for(String s: data)
            insert(s);

    }

    public void insert(String s){
        double loadFactor = loadFactor();
        if(loadFactor>0.75)
            rehash(s);
        else{
            int index = modHashFunction(s,hashTable.length);
            for (int i = index;i<hashTable.length;i++)
            {
                int newIndex = i%hashTable.length;
                if(hashTable[i] ==null) {
                    hashTable[newIndex] = s;
                    break;
                }
            }
            counter++;
        }
    }

    public int searchElem(String wrd){
        int index = modHashFunction(wrd,hashTable.length);
        for(int i=index;i<hashTable.length;i++)
        {
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(wrd))
                return newIndex;
        }
        return -1;
    }

    public boolean search(String wrd){
        return searchElem(wrd)>=0;
    }

    public void delete(String wrd){
        int index = searchElem(wrd);
        hashTable[index] = null;
    }

    public void display(){
        for (int i=0;i<hashTable.length;i++)
            System.out.println("Index "+i+" key "+hashTable[i]);
    }


}
