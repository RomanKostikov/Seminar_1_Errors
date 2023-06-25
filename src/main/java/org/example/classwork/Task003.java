package org.example.classwork;

public class Task003 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] arr2 = {2, 0, 2, 0, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i] + " / " + arr2[i] + " = " + arr[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива!");
                System.out.println("getMessage() = " + e.getMessage());
                e.printStackTrace();
                System.out.println("e = " + e);
                System.out.println("e.getCause() = " + e.getCause());
            }
        }
    }
}
