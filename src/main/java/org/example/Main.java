package org.example;

public class Main {
    public static void main(String[] args) {
        class m {
        public static void main(String[] args) {
            double[] numbers = {8.5, 6.3, -2.1, -4.8, 2.7, 3.9, 6.2, -7.4, 1.5, 9.8, -3.2, -6.7, 4.1, -5.5, 0.9};

            boolean negativeFound = false;

            double positiveSum = 0;
            int positiveCount = 0;

            for (double num : numbers) {
                if (!negativeFound) {

                    if (num < 0) {
                        negativeFound = true;
                    }
                } else {
                    if (num > 0) {
                        positiveSum += num;
                        positiveCount++;
                    }
                }
            }


            if (positiveCount > 0) {
                double average = positiveSum / positiveCount;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
            } else {
                System.out.println("В массиве нет положительных чисел после первого отрицательного.");
            }
        }
    }

        System.out.println("Hello world!");
    }
}