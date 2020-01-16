package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
Вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.


*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= i; k++) {
            System.out.print("8");
            } 
            System.out.println();
        } 
        
    }

}

