package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------LIST-----------------------------------------");
        Person p1 = new Person("Александр", "Хоревич", Gender.MALE);
        Person p2 = new Person("Эльвира", "Хоревич", Gender.FEMALE);
        Person p3 = new Person("Ольга", "Григорьева", Gender.FEMALE);
        Person p4 = new Person("Илья", "Скадорва", Gender.MALE);
        Person p5 = new Person("Иван", "Кайль", Gender.MALE);

        List<Person> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        for (Person person : list) {
            System.out.println(person);
            System.out.println();
        }
        System.out.println("Общее количество элементов: " + list.size());
        System.out.println();

        System.out.println("-----------------------------------SET-----------------------------------------");
        Person p6 = new Person("Александр", "Хоревич", Gender.MALE);
        Person p7 = new Person("Александр", "Хоревич", Gender.MALE);
        Person p8 = new Person("Ольга", "Григорьева", Gender.FEMALE);
        Person p9 = new Person("Илья", "Скадорва", Gender.MALE);
        Person p10 = new Person("Ольга", "Григорьева", Gender.FEMALE);

        Set<Person> set = new HashSet<>();
        set.add(p6);
        set.add(p7);
        set.add(p8);
        set.add(p9);
        set.add(p10);

        for (Person person1 : set) {
            System.out.println(person1);
            System.out.println();
        }
        System.out.println("Общее количество элементов: " + set.size());
        System.out.println();

        System.out.println("-----------------------------------MAP-----------------------------------------");
        Person p11 = new Person("Александр", "Хоревич", Gender.MALE);
        Person p12 = new Person("Артем", "Ганжажаров", Gender.MALE);
        Person p13 = new Person("Ольга", "Григорьева", Gender.FEMALE);
        Person p14 = new Person("Иван", "Кайль", Gender.MALE);
        Person p15 = new Person("Александр", "Нурматов", Gender.MALE);

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, p11);
        map.put(2, p12);
        map.put(6, p13);
        map.put(4, p14);
        map.put(5, p15);
        for(Map.Entry<Integer, Person> number : map.entrySet()){
            System.out.println("Ключ: " + number.getKey()+ "." + number.getValue());
            System.out.println();
        }
        System.out.println("Общее количество элементов: " + map.size());
    }
}
