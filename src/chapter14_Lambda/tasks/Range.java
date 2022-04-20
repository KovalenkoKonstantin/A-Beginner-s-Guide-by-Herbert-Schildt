package chapter14_Lambda.tasks;

import java.util.function.Predicate;

/**Составьте лямбда-выражение, которое возвращает значение true, если число
 принадлежит к диапазону чисел 10-20, включая граничные значения.*/
public class Range {
    public static void main(String[] args) {
        int x = 15;
        Predicate <Integer> intValue = (n)-> (n <= 20 & n >= 10);
        if(intValue.test(x))System.out.println(x + " Лежит в диапазоне 10-20");
        else System.out.println(x + " Лежит вне диапазона 10-20");

        double y = 17.0;
        Predicate <Double> doubValue = (n)-> (n <= 20.0 & n >= 10.0);
        if(doubValue.test(y))System.out.println(y + " Лежит в диапазоне 10.0-20.0");
        else System.out.println(y + " Лежит вне диапазона 10.0-20.0");

        long z = 12L;
        MyTest <Long> longValue = (n)-> (n <= 20L & n >= 10L);
        if(longValue.testing(z))System.out.println(z + " Лежит в диапазоне 10.0-20.0");
        else System.out.println(z + " Лежит вне диапазона 10.0-20.0");
    }
}
