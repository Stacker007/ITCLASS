package com.company;

/*Заданы поля структуры Автомобиль:
Марка,
Пробег,
Стоимость.
Создать массив элементов структуры.
Ввести и вывести соответствующие данные, а
также вывести все записи, стоимость которых ниже указанной.

 */

import java.util.Scanner;

public class Task8 {

    public static void tab() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество автомобилей: ");
        int countOfCars;
        try {
            countOfCars = Integer.parseInt(in.nextLine());

        } catch (Exception e) {
            throw new Exception("Ошибка ввода!");
        }
        Vehicles[] your = new Vehicles[countOfCars];
        for (int i = 0; i < countOfCars; i++) {
            your[i] = new Vehicles();
        }

        System.out.println("Введите максимальную стоимость автомобиля: ");
        int costGeneral;
        try {
            costGeneral = Integer.parseInt(in.nextLine());

        } catch (Exception e) {
            throw new Exception("Ошибка ввода!");
        }

        System.out.println("Выбранные автомобили:");

        for (int i = 0; i < countOfCars; i++) {
            if (your[i].retCost() < costGeneral) your[i].printParametres();

        }


    }
}
