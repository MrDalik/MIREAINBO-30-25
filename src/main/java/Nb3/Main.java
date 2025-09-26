package Nb3;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static void main() {
        String flag;
        do {
            flag = "0";
            Random random = new Random();
            int c = 0, f = 0, r;
            String s1 = "qwertyuiopasdfghjklzxcvbnmйцукенгшщзхъфывапролджэячсмитьбю", s2 = s1.toUpperCase(), q = "!@#$%^&*()_+-={}[];':,.<>/?`~", p = "1234567890";
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите длину пароля от 8 до 12");
                    c = sc.nextInt();
                } catch (Exception ex) {
                    System.out.println("это не валидное значение");
                }
            } while (c < 7 || c > 13);
            char[] ar = new char[c];
            for (int i = 0; i < ar.length; i++) ar[i] = '*';
            int a1 = random.nextInt(1, c - 3);
            int a2 = random.nextInt(1, (c - a1 - 2));
            int a3 = random.nextInt(1, (c - a1 - a2 - 1));
            int a4 = c - a1 - a2 - a3;
            for (int i = 0; i < a1; i++) {
                do {
                    r = random.nextInt(ar.length);
                    if (ar[r] == '*') {
                        ar[r] = s2.charAt(random.nextInt(s2.length()));
                        break;
                    }
                } while (true);
            }
            for (int i = 0; i < a2; i++) {
                do {
                    r = random.nextInt(ar.length);
                    if (ar[r] == '*') {
                        ar[r] = s1.charAt(random.nextInt(s1.length()));
                        break;
                    }
                } while (true);
            }
            for (int i = 0; i < a3; i++) {
                do {
                    r = random.nextInt(ar.length);
                    if (ar[r] == '*') {
                        ar[r] = p.charAt(random.nextInt(p.length()));
                        break;
                    }
                } while (true);
            }
            for (int i = 0; i < a4; i++) {
                do {
                    r = random.nextInt(ar.length);
                    if (ar[r] == '*') {
                        ar[r] = q.charAt(random.nextInt(q.length()));
                        break;
                    }
                } while (true);
            }
            System.out.println(ar);
        } while (flag.equals('1'));
    }
}
