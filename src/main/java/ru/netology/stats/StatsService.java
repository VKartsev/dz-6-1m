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

    public int averageSalesAmount(int[] sales) {
        int sum = sum(sales);
        int q = 0;
        for (int sale : sales) {
          q = q + 1;
        }
        System.out.println("Средняя сумма продаж за месяц:" + sum / q);
        return sum / q;
    }

    public int topSale(int[] sales) {
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

    public int minSale(int[] sales) {
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
    public int lessAverageSale(int[] sales) {

        int sum = averageSalesAmount(sales);
        int q = 0;
        for (int sale : sales) {
            if (sum < sale) {
                q = q + 1;
            }
        }
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" + q);
        return q;
    }

    public int aboveAverageSale(int[] sales) {
        int sum = averageSalesAmount(sales);
        int q = 0;
        for (int sale : sales) {
            if (sum > sale) {
                q = q + 1;
            }
        }
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + q);
        return q;
    }

}


