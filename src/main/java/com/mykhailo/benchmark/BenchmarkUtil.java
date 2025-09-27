package com.mykhailo.benchmark;

import com.mykhailo.benchmark.tests.ListBenchmarks;

import java.io.IOException;
import java.util.*;

public class BenchmarkUtil {
    public static void compare(int[] array) throws IOException {
        List<Integer> base = new ArrayList<>();
        for (int v : array) base.add(v);

        List<ResultRow> results = new ArrayList<>();

        // ArrayList
        results.add(runListBenchmarks(new ArrayList<>(base), "ArrayList"));

        // LinkedList
        results.add(runListBenchmarks(new LinkedList<>(base), "LinkedList"));

        // Vector
        results.add(runListBenchmarks(new Vector<>(base), "Vector"));

        // Можно добавить Set, Queue и т.п.

        // Сохраняем в CSV
        CsvExporter.export("benchmark_results.csv", results);

        // Печать в консоль
        for (ResultRow row : results) {
            System.out.printf("%s: traverseGet=%.3f ms, traverseIterator=%.3f ms%n",
                    row.type, row.traverseGetMs, row.traverseIteratorMs);
        }
    }

    private static ResultRow runListBenchmarks(List<Integer> list, String name) {
        double get = ListBenchmarks.testGet(list);
        double iterator = ListBenchmarks.testIterator(list);
        return new ResultRow(name, list.size(), get, iterator);
    }
}
