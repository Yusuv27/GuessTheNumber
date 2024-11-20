package org.springframework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 10;

        while (true){
            int attempt = new Scanner(System.in).nextInt();

            if (attempt == value){
                System.out.println("Вы угадали!");
                break;
            } else if (attempt < value) {
                System.out.println("Заданное число больше");
            } else {
                System.out.println("Заданное число меньше");
            }
        }
    }
}