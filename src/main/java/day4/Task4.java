package day4;

import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
выведите значение суммы и индекс первого элемента тройки.
 */
public class Task4 {
    public static void main(String[] args) {
        Random x = new Random();
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = x.nextInt(10000);
        }

        int maximum = 0, id = 0;
        for (int i = 0; i < list.length - 2; i++) {
            int total = 0;
            for (int j = i; j < i + 2; j++) {
                total += list[j];
            }
            if (maximum < total) {
                maximum = total;
                id = i;
            }
        }
        System.out.println(maximum);
        System.out.println(id);

    }
}
