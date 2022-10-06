package dati_e_algoritmi_es.es1;

import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {
    public AppTest() {}

    @Test
    public void test1() {
        double numbers[] = {3};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);
        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }

    @Test
    public void test2() {
        double numbers[] = {3, 4};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);
        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }

    @Test
    public void test3() {
        double numbers[] = {3, 4, 5};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);
        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }

    @Test
    public void test4() {
        double numbers[] = {3, 4, 5, 6};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);
        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }

    @Test
    public void test5() {
        double numbers[] = {3, 4, 5, 6, 7};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);

        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }

    @Test
    public void testMany() {
        double numbers[] = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55};
        MinMaxSolution s = Algo.findMinMax(numbers);
        System.out.printf("Min: %f, Max: %f, N: %d, Comparisons: %d, C/N: %f\n", s.min, s.max,
                numbers.length, s.comparisons, (double) s.comparisons / numbers.length);

        assertTrue((double) s.comparisons / numbers.length < 1.5);
    }
}
