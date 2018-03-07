package com.company;

import java.util.Scanner;

/**
 * Created by Student on 07.03.2018.
 *
 * В матрице размером NxM поменять местами столбцы, номера которых вводит пользователь.
 */

public class Task4 {

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
        int firstCOL=1;
        int secondCOL=2;
        System.out.println("Введите номера столбцов, которые хотите поменять: ");
        try {
            firstCOL = Integer.parseInt(in.next())-1; // Столбцы считаются с номера 1
            secondCOL = Integer.parseInt(in.next())-1;
        } catch (Exception e) {
            throw new Exception("Ошибка ввода");
        }
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp=matrix[i][firstCOL];
            matrix[i][firstCOL]=matrix[i][secondCOL];
            matrix[i][secondCOL]=tmp;
        }
        System.out.println("Итоговая матрица:");
        printArr(n, m, matrix);

    }

    private static void printArr(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
