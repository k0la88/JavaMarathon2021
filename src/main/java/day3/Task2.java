package day3;
/*
Реализовать программу, которая пока работает,
принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль.
Программа останавливает свою работу тогда,
когда пользователь вводит 0 в качестве делителя
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            if (y == 0)
                break;
            else System.out.println(x / y);
        }
        input.close();
    }
}
