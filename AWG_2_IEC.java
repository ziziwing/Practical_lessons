package Main;

import java.util.*;
import java.io.*;

/* Данная программа помогает подобрать замену
сечения кабеля стандарта AWG(американский стандарт)
на стандарт IEC(Европейский, Российский).

This program exchange AWG (American Wire Gauge) type
cable section to IEC 60228 (use in Russia too) type.


 */

public class Main {

    public static void main(String[] args) throws IOException {
	// Создание массива для значений проводов типа AWG и их значений из типа IEC.
    // Creating array for AWG type wire values and equals values from IEC type wire.
               Map<String, String> map = new HashMap<>();
        map.put("4/0", "120");
        map.put("3/0", "95");
        map.put("2/0", "70");
        map.put("1/0", "70");
        map.put("1", "50");
        map.put("2", "35");
        map.put("3", "35");
        map.put("4", "25");
        map.put("5", "25");
        map.put("6", "16");
        map.put("7", "16");
        map.put("8", "10");
        map.put("9", "10");
        map.put("10", "6");
        map.put("11", "6");
        map.put("12", "4");
        map.put("13", "4");
        map.put("14", "2.5");
        map.put("15", "2.5");
        map.put("16", "1.5");
        map.put("17", "1.5");
        map.put("18", "1");
        map.put("19", "0.75");
        map.put("20", "0.75");
        map.put("21", "0.5");
        map.put("22", "0.5");
        map.put("23", "0.25");
        map.put("24", "0.25");
        map.put("25", "0.2");
        map.put("26", "0.2");
        map.put("27", "0.12");
        map.put("28", "0.081");
        map.put("29", "0.064");
        map.put("30", "0.051");
        map.put("31", "0.040");
        map.put("32", "0.032");
        map.put("33", "0.025");
        map.put("34", "0.020");
        map.put("35", "0.016");


        System.out.println("Введите значиен кабеля AWG, значение от 4/0 до 35");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
            if (a.equals(pair.getKey())) {
                System.out.println(pair.getValue());
            } else count++;
            if (count == (map.size())) System.out.println("Проверьте правильность введеных значений");

    }

}
