package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalcSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calcSumSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcAvgInMonth() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calcAvgInMonth(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int expected = 20;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }
}