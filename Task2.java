package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Student on 06.03.2018.
 * 2. Задана матрица размером NxN. Заполнить элементы, находящиеся на главной
 диагонали средним арифметическим значением элементов всей матрицы.
 */
public class Task2 {
    public static void tab() {
    int n=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        n=Integer.parseInt(in.next());
        int[][] matrix=new int[n][n];
        int sum=0;
        int count =0;
        Random iRand = new Random();
        for (int i=0; i<n;i++){
            for (int j=0; i<n;j++){
                matrix[i][j]=iRand.nextInt();
            }
        }
        for (int i=0; i<n;i++){
            for (int j=0; i<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }


        for (int i=0; i<n;i++){
            for (int j=0; i<n;j++){
                sum+=matrix[i][j];
            }
        }
    }
}
