package com.company;


public class Main {

    public static void main(String[] args) {
        try {
            About.numberOfTask();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
