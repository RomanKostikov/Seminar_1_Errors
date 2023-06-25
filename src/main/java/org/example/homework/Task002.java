package org.example.homework;

import java.util.Scanner;

public class Task002 {
    /*
    Напишите программу, которая запрашивает у пользователя его возраст. Если введенное значение не
    является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод".
    Иначе выведите возраст на экран.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        String input = sc.nextLine();
        try {
            int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Некорректный ввод");
        }
    }
}
