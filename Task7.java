package com.company;

import java.util.Scanner;

/**
 * Created by Student on 07.03.2018.
 *
 * Задана строка, содержащая произвольный текст. Найти и подсчитать количество вхождений второй строки в первую.
 */
public class Task7 {
    public static void tab(){
        String all, part;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите произвольный текст: ");
        all=in.nextLine();
        System.out.println("Введите искомую часть: ");
        part=in.nextLine();

        int i = 0;
        int count = 0;
        while (i<all.length()){
            if (all.charAt(i)==part.charAt(0)){
                int j=0;
                boolean flag = true;
                while (j<part.length()){
                    //Если находится отличный символ или произвольная строка заканчивается
                    if (part.charAt(j)!=all.charAt(i+j)||(i+j+1)==all.length()) {
                        flag = false;
                        break;
                    }
                    j++;
                }
                if (flag==true) count++;
            }
            i++;
        }
        System.out.println("Ответ: " + count);

    }

}
