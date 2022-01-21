package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random x = new Random();
        String[] text = new String[] {"наибольший элемент массива", "наименьший элемент массива",
                                      "количество элементов массива, оканчивающихся на 0",
                                      "сумма элементов массива, оканчивающихся на 0"};
        int[] list = new int[100];
        int[] result = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0};
        for (int i = 0; i < list.length; i++) {
            list[i] = x.nextInt(10000);
            if (list[i] > result[0]) result[0] = list[i];
            if (list[i] < result[1]) result[1] = list[i];
            if (list[i] % 10 == 0) {
                result[2]++;
                result[3] += list[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(text[i] + ": " + result[i]);
        }
    }
}
