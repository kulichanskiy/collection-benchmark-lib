package com.mykhailo.benchmark;

public class ResultRow {
    public String type;
    public int size;
    public double traverseGetNano, traverseGetMicro, traverseGetMs;
    public double traverseIteratorNano, traverseIteratorMicro, traverseIteratorMs;
    public ResultRow(String type, int size,
                     double traverseGet, double traverseIterator) {
        this.type = type;
        this.size = size;
        this.traverseGetNano = traverseGet;
        this.traverseIteratorNano = traverseIterator;
        this.traverseGetMicro = traverseGet / 1000.0;
        this.traverseIteratorMicro = traverseIterator / 1000.0;
        this.traverseGetMs = traverseGet / 1000000.0;
        this.traverseIteratorMs = traverseIterator / 1000000.0;
    }
}
