package org.example.Nb1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        String flag;
        do {
            flag = "0";
            Scanner sc = new Scanner(System.in);
            char A, B;
            String[] arr = {"виселица", "роза", "океан", "яблоко", "мир"};
            Random random = new Random();
            int Rand = random.nextInt(5), hp = 6;
            String slovo = arr[Rand], letter, alh = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя", ban = "";
            char[] slovo1 = new char[slovo.length()];
            for (int i = 0; i < slovo.length(); i++) slovo1[i] = '*';
            System.out.print("Слово состоит из " + slovo.length() + " букв  ");
            System.out.println(slovo1);
            while (hp > 0) {
                System.out.print("У вас " + hp + " hp  ");
                System.out.println(slovo1);
                do {
                    System.out.println("Введите русскую букву");
                    letter = sc.nextLine().toLowerCase();
                    if (ban.contains(letter)) System.out.println("буква  " + letter.toUpperCase() + "  уже есть!\n\n");
                } while (letter.length() != 1 || !alh.contains(letter) || ban.contains(letter));
                B = letter.charAt(0);
                if (slovo.contains(letter)) {
                    for (int i = 0; i < slovo.length(); i++) {
                        A = slovo.charAt(i);
                        if (A == B) slovo1[i] = B;
                    }
                    ban += B;
                    System.out.print("Верная буква!    ");
                    //               String s = Arrays.toString(slovo1);
                    if (!Arrays.toString(slovo1).contains("*")) {
                        System.out.print("\nВЫ ПОБЕДИЛИ!  " + slovo.toUpperCase());
                        break;
                    }
                } else {
                    hp--;
                    System.out.println("НЕВЕРНО!!!");
                }
            }
            if (hp == 0) System.out.println("HP КОНЧИЛИСЬ ВЫ ПРОИГРАЛИ!!!");
            System.out.println("\n1 - заново");
            flag = sc.nextLine();
        } while (flag.equals("1"));
    }
}


