package org.example.ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character,TrieNode> childNode;
    boolean endOfString;

    TrieNode(){
        childNode = new HashMap<>();
        endOfString = false;
    }

    public Map<Character, TrieNode> getMap() {
        return childNode;
    }

    public boolean isEndOfWord() {
        return endOfString;
    }

    public void setEndOfWord(boolean b) {
        this.endOfString = b;
    }
}
