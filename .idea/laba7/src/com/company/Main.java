package com.company;

import java.util.LinkedList;

public class Main {
    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        LinkedList<Car> list= new LinkedList<>();
        Car car1=new Car("BMW");
        Car car2=new Car("Ford");
        Car car3=new Car("Toyota");

        list.add(car1);
        list.add(car2);
        list.add(car3);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //List<String> list2= new LinkedList<String>();
        Entry newEntry = new Entry("0", header, header.prev);

    }

}
