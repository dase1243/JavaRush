package com.javarush.glushko.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            int j = 1;
            for (; j < i + 1; ) {
                System.out.print(8);
                j++;

            }
            System.out.println("");

        }

    }
}
