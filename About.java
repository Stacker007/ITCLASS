package com.company;

import java.util.Scanner;

/**
 * Created by Student on 06.03.2018.
 */
public class About {
    public static void numberOfTask() throws Exception

    {
        System.out.println("Выберите номер задачи (1~8): ");

        int choice = -1;

        Scanner in = new Scanner(System.in);
        try {
            choice = Integer.parseInt(in.next());
        }catch (Exception e){
            throw new Exception("Ошибка ввода!");
        }

        switch (choice) {
            case 1:
                Task1.tab();
                break;
            case 2:
                Task2.tab();
                break;
            case 3:
                Task3.tab();
                break;
            case 4:
                Task4.tab();
                break;
            case 5:
                ;
                break;
            case 6:
                ;
                break;
            case 7:
                ;
                break;
            case 8:
                ;
                break;
            default:
                throw new Exception("Задачи с таким номером нет!");
        }


    }

}
