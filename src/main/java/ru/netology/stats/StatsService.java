package ru.netology.stats;

public class StatsService {

    public int calcSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvgInMonth(int[] sales) {

        return calcSumSales(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int findMin(int[] sales) {
        int currentMin = sales[0];
        for (int sale : sales) {
            if (sale < currentMin) {
                currentMin = sale;
            }
        }
        return currentMin;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

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
}