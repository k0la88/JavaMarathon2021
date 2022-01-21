package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level = input.nextInt();
        input.close();
        if (level > 0 && level <= 4) System.out.println("Малоэтажный дом");
        else if (level > 4 && level <=8) System.out.println("Среднеэтажный дом");
        else if (level >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
    }
}
