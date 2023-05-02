package org.example.algo.greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class FractionalKnapsack {


    public static int maxValue(ArrayList<Item> items, int kWeight){

        int maxVal = 0;
        for (Item item: items){
            if(kWeight >= item.getWeight()) {
                maxVal += item.getVw() * item.getWeight();
                kWeight = kWeight - item.getWeight();
                //System.out.println("Tanking "+item.getWeight()+" units of "+item.getValue()+" weight changed to "+kWeight);
            }
            else{
                maxVal += item.getVw() * kWeight;
              //  System.out.println("Tanking fractional "+kWeight+" units of "+item.getValue()+" weight changed to "+0);
                kWeight = 0;
                break;
            }
            //System.out.println("Value taken "+maxVal);
        }

        return maxVal;
    }

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
//        items.add(new Item(21,7));
//        items.add(new Item(24,4));
//        items.add(new Item(12,6));
//        items.add(new Item(40,5));
//        items.add(new Item(30,6));

        items.add(new Item(100,20));
        items.add(new Item(120,30));
        items.add(new Item(60,10));

        Comparator<Item> comparator = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.getVw()-o1.getVw();
            }
        };
        items.sort(comparator);

        System.out.println(items);

        System.out.println("max Val "+maxValue(items,50));


    }
}
