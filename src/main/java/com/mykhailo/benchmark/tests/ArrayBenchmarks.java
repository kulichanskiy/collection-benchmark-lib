package com.mykhailo.benchmark.tests;

import com.mykhailo.benchmark.StopWatch;

public class ArrayBenchmarks {
    public static double testGet(Integer[] array) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < array.length; i++) {
        	Integer value = array[i];
        }
        sw.stop();
        return sw.getElapsedTime();
    }

    public static double testForEach(Integer[] array) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (Integer value : array)
        sw.stop();
        return sw.getElapsedTime();
    }
}