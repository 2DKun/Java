package pac;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();  //создание списка 1 и заполнение
        al.add("Hi2");
        al.add("Hi3");

        WaitList<String> wl = new WaitList<>(); //создание списка 2 и заполнение
        wl.add("Hi");
        wl.add("Hi2");
        wl.add("Hi3");
        System.out.println(wl); //вывод списка
        System.out.println(wl.remove()); //вывод первого элемента списка
        System.out.println(wl);
        System.out.println(wl.isEmpty()); //проверка на пустоту
        System.out.println(wl.contains("Hi")); //проверка на содержание элемента
        System.out.println(wl.containsAll(al));  //сверка списков

        System.out.println();

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3); //создание списка BoundedWaitList на 3 элемента
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");
        System.out.println(bwl); //вывод списка
        try{
            bwl.add("bar2"); //ошибка при добавлении 4 элемента
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(bwl);
        System.out.println(bwl.getCapacity()); //количество элементов

        System.out.println();
        bwl = new BoundedWaitList<String>(al); //копирование другого списка
        System.out.println(bwl.getCapacity()); //количество элементов
        try{
            bwl.add("bar2");  //ошибка при добавлении 3 элемента
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>(); //создание списка UnfairWaitList
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5); //удаление элемента из списка, но не первый
        System.out.println(uwl);
        uwl.moveToBack(1); //возврат элемента в конец списка
        System.out.println(uwl);


    }
}
