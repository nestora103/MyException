package ru.geekbrains.java2.dz.dz1.gubenkoDM;

import java.util.Scanner;

/**
 * Created by Nestor on 29.11.2016.
 */
public class ExceptionTester {
    //задание размерности матрицы.
    private static final int ARRAY_SIZE=4;
    public static void main(String[] args) {
        System.out.println("Введите строку состоящую из цифр. Отделяйте каждую цифру пробелом, для переноса чтоки на следующую строку исползуйте \\n.");
        System.out.println("Строка должна представлять из себя совокупность цифр по 4 разделленых переносом чтобы в итоге получилась матрица 4x4");
        System.out.println("Пример ввода! 1 3 1 2\\n2 3 2 2\\n5 6 7 1\\n3 3 1 0");
        Scanner sc=new Scanner(System.in);
        String str=new String("1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0");
        //Вопрос! Почему если мы из консоли эту же строку скопируем и вставим то split("\n") не будет работать
        StringParser exct=new StringParser(sc.nextLine(),ARRAY_SIZE);//(sc.nextLine()); (str,ARRAY_SIZE)
        try {
            System.out.println(exct.parse());
        }catch (MyException e){
            System.out.println(e.toString());
        }

    }
}
