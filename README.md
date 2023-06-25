# Урок 1. Обработка ошибок в программировании
## Classwork
### task001
// Код, который может вызывать ошибку
throw new Exception("Ошибка: файл не найден");
## Homework
### Task001: Проверка деления на ноль
Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление. 
Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением 
"Деление на ноль недопустимо". Иначе выведите результат деления на экран.
### Task002: Обработка некорректного ввода
Напишите программу, которая запрашивает у пользователя его возраст. Если введенное значение не 
является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод". 
Иначе выведите возраст на экран.
### Task003*: Чтение файла и подсчет суммы чисел
Напишите программу, которая считывает содержимое текстового файла, в котором каждая 
строка содержит одно число. Программа должна подсчитать сумму всех чисел в файле. 
Если встретится строка, которая не может быть преобразована в число, выбросите исключение 
NumberFormatException с сообщением "Некорректное значение числа в файле".