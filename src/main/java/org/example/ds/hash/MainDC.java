package org.example.ds.hash;

public class MainDC {
    public static void main(String[] args) {
        DirectChaining dc= new DirectChaining(12);
        dc.insert("The");
        dc.insert("quick");
        dc.insert("red");
        dc.insert("fox");
        dc.insert("jumped");
        dc.insert("over");
        dc.printTable();

        //System.out.println(dc.search("over"));
        System.out.println(dc.delete("quick"));

        dc.printTable();

    }

}
