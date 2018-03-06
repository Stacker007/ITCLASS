package com.company;

import java.util.Scanner;

/**
 * Created by Student on 06.03.2018.
 *
 * 1. Вывести на экран таблицу значений ряда y для x изменяющихся от n до m с
 * шагом h. (y=x 3 +3x 2 ).
 */
public class Task1 {
    public static void tab(){
        double n,m, h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        n=Double.parseDouble(in.next());
        System.out.println("Введите верхнюю границу диапазона: ");
        m=Double.parseDouble(in.next());
        System.out.println("Введите шаг табуляции: ");
        h=Double.parseDouble(in.next());
        System.out.println("----------------------");
        System.out.println("|    x    |     Y    |");
        System.out.println("----------------------");

        for (double x = n; x < m+h;x+=h) {
            double y =Math.pow(x,3)+3*Math.pow(x,2);
            System.out.format("|%9.2f|%10.3f|\n", x, y);
        }
        System.out.println("----------------------");
    }


}
