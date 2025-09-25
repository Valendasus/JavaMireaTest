package task2;

import java.util.*;

public class ExchangeRate {
    private static final double USD_TO_RUB = 95.0;
    private static final double EUR_TO_RUB = 100.0;
    private static final double CNY_TO_RUB = 13.0;
    private static final double AED_TO_RUB = 26.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Курсы валют в рублях:");
        System.out.println("1 Доллар = " + USD_TO_RUB + " Рублей" );
        System.out.println("1 Евро = " + EUR_TO_RUB + " Рублей");
        System.out.println("1 Юань = " + CNY_TO_RUB + " Рублей");
        System.out.println("1 Дирхам = " + AED_TO_RUB + " Рублей");

        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        System.out.println(rubles + " Рублей = " + (rubles / USD_TO_RUB) + " Доллара");
        System.out.println(rubles + " Рублей = " + (rubles / EUR_TO_RUB) + " Евро");
        System.out.println(rubles + " Рублей = " + (rubles / CNY_TO_RUB) + " Юаня");
        System.out.println(rubles + " Рублей = " + (rubles / AED_TO_RUB) + " Дирхама");
    }
}
