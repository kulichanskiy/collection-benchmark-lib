package com.mykhailo.benchmark.tests;

import com.mykhailo.benchmark.StopWatch;

import java.util.*;

public class ListBenchmarks {
    public static double testGet(List<Integer> list) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        sw.stop();
        return sw.getElapsedTime();
    }

    public static double testIterator(List<Integer> list) {
        StopWatch sw = new StopWatch();
        sw.start();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        sw.stop();
        return sw.getElapsedTime();
    }
}
