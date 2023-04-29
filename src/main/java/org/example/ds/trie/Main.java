package org.example.ds.trie;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();

        //trie.insert("API");
        trie.insert("APIS");
        trie.insert("APPLET");
        trie.insert("API");
        trie.insert("PAK");



        trie.delete("APIS");
        System.out.println(trie.searchString("APIS"));
        System.out.println(trie.searchString("API"));


    }

}
