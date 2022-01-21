package day4;
/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random x = new Random();
        int[][] matrix = new int[12][8];
        int result = 0;
        int id = 0;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = x.nextInt(50);
                total += matrix[i][j];
                if (result <= total) {
                    result = total;
                    id = i;
                }
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + id);
    }
}
