package org.example.ds.trie;


import java.util.HashMap;

public class Trie {

    TrieNode root;
    Trie(){
        root = new TrieNode();
        //System.out.println("Trie created");
    }


//    private boolean delete(TrieNode currNode, String word, int index) {
//        char ch = word.charAt(index);
//        TrieNode childrenNode = currNode.childNode.get(ch);
//        boolean canThisNodeBeDeleted;
//        if (childrenNode.childNode.size() > 1) {
//                                                System.out.println(ch+" MORE THAN ONE CHILD "+currNode.getChildren().keySet());
//            delete(childrenNode, word, index+1);
//            return false;
//        }
//        if (index == word.length() -1) {
//                                                    System.out.println(ch+" index == len of word meaning LAST LETTER OF WORD "+currNode.getChildren().keySet());
//            if (childrenNode.childNode.size()>=1) {
//                                                    System.out.println(ch+" still more left in the trie meaning i/p word is prefix of some other word "+currNode.getChildren().keySet());
//                childrenNode.endOfString = false;
//                return false;
//            } else {
//                                        System.out.println(ch+" no more left in the trie meaning i/p word is the end node  so it can be removed "+currNode.getChildren().keySet());
//                currNode.childNode.remove(ch);
//                return true;
//            }
//        }
//        if (childrenNode.endOfString == true) {
//                                            System.out.println(currNode.childNode.keySet()+" "+ch+" This NODE IS END OF OTHER STRING "+childrenNode.childNode.keySet());
//            delete(childrenNode, word, index+1);
//            return false;
//        }
//        canThisNodeBeDeleted = delete(childrenNode, word, index+1);
//        if (canThisNodeBeDeleted == true) {
//                                                        System.out.println(ch+" ENTIRE NODE CAN BE DELETED"+currNode.childNode.keySet());
//            currNode.childNode.remove(ch);
//            return true;
//        } else {
//            return false;
//        }
//    }




    private boolean delete1(TrieNode current, String word, int index) {

        if (index == word.length()) {
                                                System.out.println(current.childNode.keySet()+" LAST LETTER OF I/P "+current.childNode.keySet());
            if (!current.isEndOfWord()) {
                                                    System.out.println(current.childNode.keySet()+" NOT LEAF SO CANT BE DELETED(means its a prefix to a different string ) "+current.childNode.keySet());
                return false;
            }
                                                    System.out.println(current.childNode.keySet()+"Set the nodes end of string property to false effectively removing string from trie   hasChild"+current.childNode.isEmpty());
            current.setEndOfWord(false);
            return current.getMap().isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode childrenNode = current.getMap().get(ch);
                                                                System.out.println(current.childNode.keySet()+" children node  "+childrenNode.childNode.keySet()+" char to be used "+ch);
        if (childrenNode == null) {
            return false;
        }
        boolean call = delete1(childrenNode, word, index + 1);
        boolean shouldDeleteCurrentNode =  call && !childrenNode.isEndOfWord();
                                                                        System.out.println(current.childNode.keySet()+" current "+ch+" should be deleted "+shouldDeleteCurrentNode+" is children node end of any word "+childrenNode.endOfString+" recursive calls "+call);
        if (shouldDeleteCurrentNode) {
            System.out.println(current.childNode.keySet()+" current "+ch+" should be deleted "+shouldDeleteCurrentNode+" CAN BE DELETED");
            current.getMap().remove(ch);
            return current.getMap().isEmpty();
        }
        return false;
    }

    public void delete(String word) {
        if (searchString(word) == true) {
            delete1(root, word, 0);
        }
    }



    TrieNode getNewTrieNode() {
        TrieNode node = new TrieNode();
        node.endOfString = false;
        node.childNode = new HashMap<>();
        return node;
    }

     void insert(String str) {
        TrieNode temp = root;
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            /* make a new node if there is no path */
            if (!temp.childNode.containsKey(x))
                temp.childNode.put(x, getNewTrieNode());

            temp = temp.childNode.get(x);
        }
        temp.endOfString = true;
    }

    /* function to search in trie */
    boolean searchString(String str) {
        /* return false if Trie is empty */
        if (root == null)
            return false;

        TrieNode temp = root;
        for (int i = 0; i < str.length(); i++) {

            /* go to next node */
            if (!temp.childNode.containsKey(str.charAt(i)))
                return false;

            temp = temp.childNode.get(str.charAt(i));
        }
        return temp.endOfString;
    }
}
