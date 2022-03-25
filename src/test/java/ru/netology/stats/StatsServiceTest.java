package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalcSumSales() {

        int expected = 180;
        int actual = service.calcSumSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcAvg() {

        int expected = 15;
        int actual = service.calcAvg(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcMonthSalesOverAvg() {

        int expected = 5;
        int actual = service.amountMonthSalesOverAvg(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthSalesUnderAvg() {

        int expected = 5;
        int actual = service.amountMonthSalesUnderAvg(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {

        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {

        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }
}