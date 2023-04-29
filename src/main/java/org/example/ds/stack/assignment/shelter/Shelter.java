package org.example.ds.stack.assignment.shelter;

import java.util.LinkedList;

public class Shelter {

    LinkedList<Cat> cats;
    LinkedList<Dog> dogs;
    int order;

    Shelter(){
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Cat)
            cats.addLast((Cat) a);
        else
            dogs.addLast((Dog) a);
    }

    public Cat deQueueCat(){
        return cats.poll();
    }

    public Dog deQueueDog(){
        return dogs.poll();
    }

    public int size(){
        return cats.size() + dogs.size();
    }

    public Animal deQueueAny(){
        if (dogs.isEmpty())
            return cats.poll();
        else if(cats.isEmpty())
            return dogs.poll();
        else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();
                if(oldestDog.olderThan(oldestCat))
                    return dogs.poll();
                else
                    return cats.poll();
        }
    }
}

class Operation{

    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.enqueue(new Cat("Kiki"));
        shelter.enqueue(new Cat("Kari"));
        shelter.enqueue(new Dog("Beji"));
        shelter.enqueue(new Cat("Reki"));
        shelter.enqueue(new Dog("Dexter"));

        System.out.println(shelter.deQueueAny().name);
        System.out.println(shelter.deQueueCat().name);
        System.out.println(shelter.deQueueDog().name);
        System.out.println(shelter.deQueueAny().name);

    }

}
