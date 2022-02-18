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

//Метод ниже считает номер месяца минимальных продаж.
// Логика его такова: заводим переменную minMonth для хранения номера ячейки
// в массиве того месяца, в котором были минимальные продажи среди всех
// уже просмотренных; изначально мы никакие ещё не просмотрели, потому
// запишем туда номер 0. Будем циклом поочерёдно смотреть месяцы продаж:
// на каждой итерации у нас в sale будет количество продаж
// в рассматриваемом месяце, в month - номер этого рассматриваемого месяца.
// Если мы смотрим на месяц в котором продажи меньше чем в минимальном
// из просмотренных ранее (чей номер запомнен в minMonth),
// то считаем теперь этот рассматриваемый месяц минимальным
// (присваиваем в minMonth значение month).
// И так до конца массива продаж, тогда после цикла в minMonth у нас будет
// лежать номер месяца минимальных продаж. Останется только один момент:
// мы нумеровали месяцы с нуля (тк в массивах ячейки нумеруются с нуля),
// потому отдавая ответ нам надо прибавить 1.
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