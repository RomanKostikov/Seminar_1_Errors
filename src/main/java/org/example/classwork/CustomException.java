package org.example.classwork;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class AnotherCustomException extends Exception {
    public AnotherCustomException(String message) {
        super(message);
    }
}

class FileProcessor {
    public static void processFile() throws FileNotFoundException, CustomException, AnotherCustomException {
        // Некоторый код, который может вызвать исключения
        //throw new FileNotFoundException("Файл не найден");
        // throw new CustomException("Произошла пользовательская ошибка");
        throw new AnotherCustomException("Произошла другая пользовательская ошибка");
    }
}

class MainClass {
    public static void main(String[] args) {
        try {
            FileProcessor.processFile(); // Вызов метода, который выбрасывает исключения
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка: файл не найден");
            // Обработка исключения FileNotFoundException
        } catch (CustomException e) {
            System.out.println("Произошла пользовательская ошибка");
            // Обработка пользовательского исключения CustomException
        } catch (AnotherCustomException e) {
            System.out.println("Произошла другая пользовательская ошибка");
            // Обработка другого пользовательского исключения AnotherCustomException
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
            // Обработка исключения IOException (необязательно)
        }
    }
}
