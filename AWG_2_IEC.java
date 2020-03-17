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
	// Создание массива для значений проводов типа AWG.
    // Creating array for AWG type wire values.
        ArrayList<String> awg = new ArrayList<>();
            awg.add("4/0");
            awg.add("3/0");
            awg.add("2/0");
            awg.add("1/0");
            for(int i = 4; i <= 38; i++) {
                int j = i - 3;
                String j1 = Integer.toString(j);
                awg.add(i , j1);
            }
     // Создание массива для значений сечений проводов типа IEC
     // Creating array for IEC type wire section values.
        Double[] iec = {120d, 95d, 70d, 70d, 50d, 35d, 35d, 25d, 25d, 16d, 16d, 10d, 10d, 6d, 6d, 4d,
                        2.5, 2.5, 2d, 1.5, 1.5, 1d, 0.75, 0.75, 0.5, 0.5, 0.25, 0.25,
                        0.2, 0.2, 0.12, 0.08, 0.08, 0.05, 0.05, 0.05, 0.03, 0.025, 0.02};
        System.out.println("Введите значиен кабеля AWG");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
            for(int i = 0; i < awg.size(); i++) {
                if(a.equals(awg.get(i))) {
                    System.out.println("Вам нужно сечение провода равное: " + iec[i]);
                    break;
                }
            }
        }


    }

