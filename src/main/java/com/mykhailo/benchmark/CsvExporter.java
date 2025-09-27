package com.mykhailo.benchmark;

import java.io.*;
import java.util.List;

public class CsvExporter {
    public static void export(String fileName, List<ResultRow> rows) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("Type,Size,TraverseGet(ns),TraverseIterator(ns),TraverseGet(micros),TraverseIterator(micros),TraverseGet(ms),TraverseIterator(ms)");
            for (ResultRow row : rows) {
                pw.printf("%s,%d,%.3f,%.3f,%.3f,%.3f%n",
                        row.type, row.size,
                        row.traverseGetNano, row.traverseIteratorNano,
                        row.traverseGetMicro, row.traverseIteratorMicro,
                        row.traverseGetMs, row.traverseIteratorMs);
            }
        }
    }
}
