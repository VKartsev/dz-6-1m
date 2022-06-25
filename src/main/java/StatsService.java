package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        System.out.println("Сумма всех продаж:" + sum);
        return sum;
    }

    public int average(int[] sales) {
        int sum = sum(sales);
        //int sum = 0;
        int q = 0;
        for (int sale : sales) {
            // sum += sale;
            q = q + 1;
        }
        System.out.println("Средняя сумма продаж за месяц:" + sum / q);
        return sum / q;
    }

    public int topsale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        maxMonth = maxMonth + 1;
        System.out.println("Номер месяца, в котором был пик продаж:" + maxMonth);
        return maxMonth;
    }

    public int minsale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        minMonth = minMonth + 1;
        System.out.println("Номер месяца, в котором был минимум продаж:" + minMonth);
        return minMonth;
    }

    public int lessaveragesale(int[] sales) {
        int sum = sum(sales);
//        int sum = 0;
        int q = 0;
        for (int sale : sales) {
            //  sum += sale;
            q = q + 1;
        }
        sum = sum / q;
        q = 0;
        for (int sale : sales) {
            if (sum < sale) {
                q = q + 1;
            }
        }
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" + q);
        return q;
    }

    public int aboveaveragesale(int[] sales) {
        int sum = sum(sales);
        // int sum = 0;
        int q = 0;
        for (int sale : sales) {
            //  sum += sale;
            q = q + 1;
        }
        sum = sum / q;
        q = 0;
        for (int sale : sales) {
            if (sum > sale) {
                q = q + 1;
            }
        }
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + q);
        return q;
    }

}




