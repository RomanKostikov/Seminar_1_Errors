package org.example.homework;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task001 {
    /*
    Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
    Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением
    "Деление на ноль недопустимо". Иначе выведите результат деления на экран.
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.printf("%d / %d = %d", num1, num2, division(num1, num2));
        } catch (InputMismatchException e){
            System.out.println("Некорректный ввод!");
        }
    }

    public static int division(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
}
