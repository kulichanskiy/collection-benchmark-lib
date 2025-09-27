package com.mykhailo.benchmark.tests;

import java.util.Iterator;
import java.util.Set;

import com.mykhailo.benchmark.StopWatch;

public class SetBenchmarks {
    public static double testIterator(Set<Integer> set) {
        StopWatch sw = new StopWatch();
        sw.start();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        sw.stop();
        return sw.getElapsedTime();
    }
}
