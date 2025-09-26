package Nb2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String flag;
        do {
            flag = "0";
            int val1 = 0;
            double sum = 0, rub;
            String[] val = {"USD", "RUB", "EUR", "CNY", "JPY"};
            Double[] zerkalo = {0.0119, 1.0, 0.0102, 0.0856, 1.79};
            for (int i = 0; i < val.length; i++) {
                System.out.println((i + 1) + " - " + val[i]);
            }
            do {
                System.out.println("Выберите валюту (1 -- " + val.length + ")");
                try {
                    Scanner sc = new Scanner(System.in);
                    val1 = sc.nextInt();
                } catch (Exception ex) {
                    System.out.println("Введите корректное значение");
                }
            } while (val1 < 1 || val1 > val.length);
            System.out.println("\n");
            do {
                System.out.println("Введите количество");
                try {
                    Scanner sc = new Scanner(System.in);
                    sum = sc.nextDouble();
                } catch (Exception ex) {
                    System.out.println("Введите корректное значение");
                }
            } while (sum <= 0);
            System.out.println("\n" + sum + " " + val[val1 - 1] + "\n");
            rub = (sum * 1 / zerkalo[val1 - 1]);
            for (int i = 0; i < zerkalo.length; i++) {
                System.out.println(rub * zerkalo[i] + "  " + val[i]);
            }
            System.out.println("\n1 - заново");
            flag = scan.nextLine();
        } while (flag.equals("1"));
    }
}