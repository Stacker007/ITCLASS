package com.company;

import java.util.Scanner;

public class Vehicles {
    public static String marr;
    private static int meas;
    private static int cost;
    public Vehicles (){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        marr = in.nextLine();
        System.out.print("Введите пробег (Натуральное число): ");
        try {
            meas = Integer.parseInt(in.nextLine());
            System.out.print("Введите стоимость (Натуральное число): ");
            cost = Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
        }
    }
    public static void printParametres(){
        System.out.println("Марка: "+ marr);
        System.out.println("Пробег: "+ meas);
        System.out.println("Стоимость: "+ marr);
        System.out.println();
    }
    public static int retCost(){
        return cost;
    }
}
