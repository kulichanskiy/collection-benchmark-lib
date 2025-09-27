package com.mykhailo.benchmark;

import com.mykhailo.benchmark.tests.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 100000; // количество элементов
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(array));
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(array));

        // 🔹 Тестируем массив
        System.out.println("Array get: " + ArrayBenchmarks.testGet(array));
        System.out.println("Array for-each: " + ArrayBenchmarks.testForEach(array));

        // 🔹 Тестируем ArrayList
        System.out.println("ArrayList get: " + ListBenchmarks.testGet(arrayList));
        System.out.println("ArrayList iterator: " + ListBenchmarks.testIterator(arrayList));

        // 🔹 Тестируем LinkedList
        System.out.println("LinkedList get: " + ListBenchmarks.testGet(linkedList));
        System.out.println("LinkedList iterator: " + ListBenchmarks.testIterator(linkedList));

        // 🔹 Тестируем HashSet
        System.out.println("HashSet iterator: " + SetBenchmarks.testIterator(hashSet));

        // 🔹 Тестируем TreeSet
        System.out.println("TreeSet iterator: " + SetBenchmarks.testIterator(treeSet));

    }
}
