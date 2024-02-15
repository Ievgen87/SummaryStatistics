package ru.netology.summarystatistics.services;

public class StatisticService {
    public int totalSalesAmount(int[] amount) {

        int sum = 0;
        for (int i = 0; i < amount.length; i++) {
            sum = sum + amount[i];
        }
        return sum;
    }

    public int averageAmount(int[] amount) {

        int average = totalSalesAmount(amount) / 12;
        return average;
    }

    public int mountNumberMaximumAmount(int[] amount) {

        int maxMount = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] >= amount[maxMount]) {
                maxMount = i;
            }
        }
        return maxMount + 1;
    }

    public int mountNumberMinimumAmount(int[] amount) {

        int minMount = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < amount[minMount]) {
                minMount = i;
            }
        }
        return minMount + 1;
    }

    public int numberOfMonthsBelowAverage(int[] amount) {

        int underAverage = 0;
        for (int money : amount) {
            int average = totalSalesAmount(amount) / 12;
            if (money < average) {
                underAverage += 1;
            }
        }

        return underAverage;
    }

    public int numberOfMonthsAboveAverage(int[] amount) {

        int underAverage = 0;
        for (int money : amount) {
            int average = totalSalesAmount(amount) / 12;
            if (money > average) {
                underAverage += 1;
            }
        }

        return underAverage;
    }


}
