package ru.netology.summarystatistics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test
    public void totalSalesAmount() {
        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.totalSalesAmount(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmount() {
        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(amount);

        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void mountNumberMaximumAmount() {
        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.mountNumberMaximumAmount(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mountNumberMinimumAmount() {

        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.mountNumberMinimumAmount(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsBelowAverage() {
        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsBelowAverage(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsAboveAverage() {
        StatisticService service = new StatisticService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsAboveAverage(amount);

        Assertions.assertEquals(expected, actual);
    }


}


