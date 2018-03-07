
package com.company;

import java.util.Scanner;

/**
 * Created by Student on 07.03.2018.
 *
 * Задана матрица размером NxM. Отсортировать элементы столбцов по возрастанию.
 */
public class Task6 {

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
        try {
            for (int j=0;j<m;j++) {
                int posl; //индекс последнего обмена
                int k = n - 1; //пока не закончены плановые проходы и обмены были
                while (k > 0) {
                    posl = -1; //флаг: обменов не было
                    for (int i = 0; i < k; i++) //меняется номер первого элемента из пары
                        if (matrix[i][j] > matrix[i + 1][j]) { //перестановка соседних элементов
                            int tmp = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = tmp;
                            posl = i; //запоминаем индекс последнего обмена
                        }
                    k = posl; //следующий просмотр до последнего обмена
                }
            }
        }catch (Exception e){
            e.printStackTrace();
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
