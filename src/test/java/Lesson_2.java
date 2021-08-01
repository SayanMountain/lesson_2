//import java.util.Arrays;

import java.util.Arrays;

public class Lesson_2
{
    public static void main(String[] args) {
        System.out.println("\n______Task1______");
        Task1 task1 = new Task1();
        System.out.println(task1.check10And20(10, 9));

        System.out.println("\n______Task2______");
        Task2 task2 = new Task2();
        task2.NegativeOrPositive(5);

        System.out.println("\n______Task3______");
        Task3 task3 = new Task3();
        System.out.println(task3.booleanNegativeOrPositive(5));

        System.out.println("\n______Task4______");
        Task4 task4 = new Task4();
        task4.printStrings("lol", 6);

        System.out.println("\n______Task5______");
        Task5 task5 = new Task5();
//        System.out.println(task5.leapYear(-4));
        System.out.println(task5.leapYear(2021));
        System.out.println(task5.leapYear(100));

        System.out.println("\n______Task6______");
        Task6 task6 = new Task6();
        task6.oneAndZero();

        System.out.println("\n______Task7______");
        Task7 task7 = new Task7();
        task7.arrFillOneHundred();

        System.out.println("\n______Task8______");
        Task8 task8 = new Task8();
        task8.decrease6();

        System.out.println("\n______Task9______");
        Task9 task9 = new Task9();
        task9.fillDiagonal();

        System.out.println("\n______Task10______");
        Task10 task10 = new Task10();
        System.out.println(Arrays.toString(task10.twoArgument(5, 5)));
    }
}






//7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//значениями 1 2 3 4 5 6 7 8 … 100;
//8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
//6 умножить на 2;
//9. Создать квадратный двумерный целочисленный массив (количество строк и
//столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
//элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу:
//индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//10. Написать метод, принимающий на вход два аргумента: len и initialValue, и
//возвращающий одномерный массив типа int длиной len, каждая ячейка которого
//равна initialValue;
//* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
//вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//11. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не
//подглядывать в методичку.
//12. Переделать проверку победы, чтобы она не была реализована просто набором
//условий, например, с использованием циклов.
//* Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества
//фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных
//ситуаций;
//*** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
//

