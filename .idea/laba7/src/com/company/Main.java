package com.company;


import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A"); //добавление в список
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.addFirst("G"); //в начало
        linkedList.addLast("H"); //в конец
        System.out.println(linkedList.element()); //извлечение первого элемента списка
        System.out.println(linkedList.contains("A")); //проверка на содержание в списке
        System.out.println(linkedList.element());
        System.out.println(linkedList.get(4)); //получение элемента под индексом
        System.out.println(linkedList.getFirst()); //получение первого элемента списка
        System.out.println(linkedList.getLast()); //получение последнего элемента списка
        System.out.println(linkedList.indexOf("C")); //получение индека указанного элемента
        System.out.println(linkedList.contains("D"));
        System.out.println(linkedList.offer("F")); //указанный элемент становиться последним
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.isEmpty()); //проверяет пустой ли список
        System.out.println(linkedList.iterator().next());
        linkedList.push("N"); //похоже на addFirst, тоже добавляет в начало списка
        System.out.println(linkedList.element());
    }
}

