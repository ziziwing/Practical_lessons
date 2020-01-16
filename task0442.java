package com.javarush.task.task04.task0442;

/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                System.out.println((sum + num));
                break;
            } else sum = sum + num;
        }
    }
}
