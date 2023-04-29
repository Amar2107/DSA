package org.example.ds.stack.assignment.shelter;

public abstract class Animal {
    String name;
    int order;

    Animal(String name){
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean olderThan(Animal a){
        return this.order < a.order;
    }

}
