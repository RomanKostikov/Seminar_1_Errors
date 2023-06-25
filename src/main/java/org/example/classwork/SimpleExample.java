package org.example.classwork;

public class SimpleExample {
    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divide(a, b); // Вызов метода, который может выбросить исключение
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка деления: " + e.getMessage());
            // Обработка исключения деления на ноль
        }
    }
}
