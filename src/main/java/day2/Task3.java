package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt() + 1, b = input.nextInt() - 1;
        if (a >= b) System.out.println("Некорректный ввод");
        else {
            while (a < b) {
                if (a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
                a++;
            }
        }
    }
}
