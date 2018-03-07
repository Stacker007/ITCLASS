package com.company;

import java.util.Scanner;

/**
 * Created by Student on 07.03.2018.
 *
 * Задан одномерный массив. Произвести ввод и вывод элементов
 * массива, используя функции, а также найти среднее арифметическое элементов этого массива.
 */
public class Task5 {
    public static void tab() throws Exception {
        int n = 1;


        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        try {
            n = Integer.parseInt(in.next());

        } catch (Exception e) {
            throw new Exception("Ошибка ввода");
        }
        if (n < 1) throw new Exception("Hеверный размер массива");
        int[] matrix = new int[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = (int) (Math.random() * 200 - 100);

        }
        System.out.println("Исходный массив:");
        printArr(n, matrix);
        System.out.println();
        System.out.format("Среднее арифметическое: %.3f", med(n, matrix));
    }

    private static void printArr(int n, int[] matrix) {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + "\t");

        }
    }

    private static double med(int n, int[] matrix) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i];
        }
        sum = sum / n;
        return sum;
    }

}
