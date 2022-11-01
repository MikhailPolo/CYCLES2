package ru.netology.stats;

import java.util.stream.IntStream;

public class StatsService {
    //1
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    //2
    public int averageSales(int[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    //3
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
//5

    public int minAverageSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (i < averageSales(sales)) {
                month++;
            }
        }
        return month;
    }

    //6
    public int maxAverageSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (i > averageSales(sales)) {
                month++;
            }
        }
        return month;
    }
}