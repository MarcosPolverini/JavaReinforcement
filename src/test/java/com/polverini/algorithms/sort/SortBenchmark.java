package com.polverini.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Threads(1)
@State(Scope.Benchmark)
public class SortBenchmark {

    @Param({"10", "100", "1000"})
    public int iterations;


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(warmups = 1, value = 1)
    @Warmup(iterations = 3, time = 10, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 10, timeUnit = TimeUnit.MILLISECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void test() throws Exception {
        Thread.sleep(ThreadLocalRandom.current().nextInt(0, iterations));
    }


    @Test
    public void benchmark() throws Exception {
        String[] argv = {};
        org.openjdk.jmh.Main.main(argv);
    }

}
