package com.company;

import java.util.Scanner;

/**
 * Created by Student on 06.03.2018.
 * 2. Задана матрица размером NxN. Заполнить элементы, находящиеся на главной
 диагонали средним арифметическим значением элементов всей матрицы.
 */
public class Task2 {

    public static void tab() throws Exception {
        int n = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        try {
            n = Integer.parseInt(in.next());
        } catch (Exception e) {
            throw new Exception("Ошибка ввода");
        }
        if (n < 1) throw new Exception("Hеверный размер матрицы");
        int[][] matrix = new int[n][n];
        int sum = 0;
        int med = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Исходная матрица:");
        printArr(n, matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        med = sum / (n * n);
        System.out.println("\nСреднее арифметическое: " + med + "\n");
        for (int i = 0; i < n; i++) {
            matrix[i][i] = med;
        }
        System.out.println("Итоговая матрица:");
        printArr(n, matrix);
    }

    private static void printArr(int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
