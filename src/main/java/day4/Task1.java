package day4;
/*
С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера
и заполнить его случайными числами от 0 до 10 (не включительно).
Используя цикл for each вывести содержимое массива в консоль,
а также вывести в консоль информацию о:

а) Длине массива +
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random x = new Random();
        String[] text = new String[]{"Длине массива", "Количестве чисел больше 8",
                                     "Количестве чисел равных 1", "Количестве четных чисел",
                                     "Количестве нечетных чисел", "Сумма всех элементов массива"};
        System.out.print("Введите длинну массива: ");
        int num = input.nextInt();
        input.close();
        int[] list = new int[num];
        int[] result = new int[6]; //Создаю массив для результатов.
        result[0] = list.length;

        for (int i = 0; i < list.length; i++) {
            list[i] = x.nextInt(10);
            if (list[i] > 8)
                result[1]++;
            if (list[i] == 1)
                result[2]++;
            if (list[i] % 2 == 0)
                result[3]++;
            else result[4] = result[4] + 1;
            result[5] += list[i];
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < result.length; i++) {
            System.out.println(text[i] + ": " + result[i]);
        }
    }
}
