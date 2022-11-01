package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatServiceTest {
    private Object resources;

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedSum = 78;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum );
    }
    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedAverageSales = 6;
        int actualAdverageSales = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAdverageSales);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedMaxSales = 12;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedMinSales = 1;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void testSalesMinAverage() {
        StatsService service = new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedSalesMinAverage = 6;
        int actualSalesMinAverage = service.minAverageSales(sales);

        Assertions.assertEquals(expectedSalesMinAverage, actualSalesMinAverage);
    }

    @Test
    public void testSalesMaxAverage() {
        StatsService service =  new StatsService();

        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int expectedSalesMaxAverage = 5;
        int actualSalesMaxAverage = service.maxAverageSales(sales);

        Assertions.assertEquals(expectedSalesMaxAverage, actualSalesMaxAverage);
    }
}
