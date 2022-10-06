package dati_e_algoritmi_es.es1;

public class Algo {
    public static MinMaxSolution findMinMax(double[] numbers) {
        if (numbers.length == 0)
            throw new IllegalArgumentException("numbers must not be empty");

        MinMaxSolution s =
                new MinMaxSolution(numbers[numbers.length - 1], numbers[numbers.length - 1]);

        for (int i = 0; i < numbers.length + (numbers.length % 2) - 2; i += 2) {
            boolean firstMin = numbers[i] < numbers[i + 1];

            int minIndex = i + (firstMin ? 0 : 1);
            int maxIndex = i + (firstMin ? 1 : 0);

            if (numbers[minIndex] < s.min)
                s.min = numbers[minIndex];

            if (numbers[maxIndex] > s.max)
                s.max = numbers[maxIndex];

            s.comparisons += 3;
        }

        if (numbers.length % 2 == 0) {
            if (numbers[numbers.length - 2] < s.min)
                s.min = numbers[numbers.length - 2];
            else if (numbers[numbers.length - 2] > s.max)
                s.max = numbers[numbers.length - 2];

            s.comparisons += numbers[numbers.length - 2] < s.min ? 1 : 2;
        }

        return s;
    }
}
