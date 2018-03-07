package com.company;

import java.util.Scanner;

/**
 * Created by Student on 07.03.2018.
 * Задана матрица размером NxM. Получить одномерный массив B, состоящий из неположительных элементов матрицы.
 *
 */
public class Task3 {

    public static void tab() throws Exception {
        int n = 1;
        int m = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер матрицы (NxM): ");
        try {
            n = Integer.parseInt(in.next());
            m = Integer.parseInt(in.next());
        } catch (Exception e) {
            throw new Exception("Ошибка ввода");
        }
        if (n < 1) throw new Exception("Hеверный размер матрицы");
        int[][] matrix = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        System.out.println("Исходная матрица:");
        printArr(n, m, matrix);
        int count = 0;
        int[] notPositive = new int[n * m];//Максимальный размер массива n*m
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] <= 0) notPositive[count++] = matrix[i][j];
            }
        }
        System.out.println("\nМассив неположительных элементов");
        printArr(count, notPositive);

    }

    private static void printArr(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printArr(int n, int[] matrix) {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + "\t");


        }
    }

}
