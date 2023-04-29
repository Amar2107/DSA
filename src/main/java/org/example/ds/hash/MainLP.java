package org.example.ds.hash;

public class MainLP {
    public static void main(String[] args) {
        LinearProbing lp= new LinearProbing(5);
        lp.insert("The");
        lp.insert("quick");
        lp.insert("red");
        lp.insert("fox");
        lp.insert("jumped");
        lp.insert("over");
        lp.display();
    }
}
