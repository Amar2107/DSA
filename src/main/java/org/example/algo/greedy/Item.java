package org.example.algo.greedy;

public class Item {

    private int value;
    private int weight;
    private int vw;

    public Item(){}

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.vw = value/weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVw() {
        return vw;
    }

    public void setVw(int vw) {
        this.vw = vw;
    }

    public String toString(){
        return this.value+" "+this.weight+" "+this.vw;}

}
