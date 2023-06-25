package org.example.classwork;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task1(){
        int[] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            nums[6] = 10;
            System.out.println("123вува");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После опператора catch");
    }


    public static void task2(){
        int[] nums = new int[4];
        System.out.println("До генерации исключения");
        nums[6] = 10;
    }

}