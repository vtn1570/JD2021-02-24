package by.it.seledtsova.jd01_04;
//Введите с консоли число людей n(nextInt() в сканере).
//Затем введите одномерный массив их фамилий (next() в сканере).
//Введите двумерный массив их зарплат за 4 квартала (N строк и 4 столбца).
//Зарплаты имеют тип int.
//Нужно для каждой фамилии выводить подсказку
//После подсказки можно через пробел вводить с консоли 4 цифры зарплат по кварталам(nextInt() в сканере).
//Постройте в консоли таблицу доходов людей по кварталам с фамилиями и итогом за год в последней колонке.

import java.util.Arrays;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // количество людей 3

        String[] lastNames = new String[n];
        for (int i = 0; i < lastNames.length; i++) {
            lastNames[i] = scanner.next(); // фамилии сотрудников
        }
        int salaryArr[][]; // создала массив з/п сотрудников с фамилиями
        salaryArr = new int[n][4];
        for (int i = 0; i < salaryArr.length; i++) {
            System.out.printf("Введите зарплату для %s\n", lastNames[i]);//вводим з/п сотрудников
            for (int j = 0; j < salaryArr[0].length; j++) {
                salaryArr[i][j] = scanner.nextInt();

            }
            System.out.println(Arrays.deepToString(salaryArr));
        }

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "ИТОГО");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Иванов", "1", "2", "3", "4", "10");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Петров", "5", "6", "7", "8", "26", "42");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Сидоров", "9", "10", "11", "12", "42");
        System.out.println();


        double total = 0;

        for (int i = 0; i < salaryArr.length; ++i) {
            double sumRow = 0;
            for (int j = 0; j < salaryArr[0].length; j++) {
                sumRow += salaryArr[i][j];
                total += salaryArr[i][j];
            }
                System.out.println("Общая сумма всех выплат=" + total);
                System.out.println();

            double allSalaryKv = 0;
            for (int j = 0; j < salaryArr[0].length; j++) {
                double averageSalary = 0;
                for (int k = 0; k < n; k++) {
                    averageSalary = averageSalary + salaryArr[i][j];
                }
                allSalaryKv = allSalaryKv + averageSalary / n;
            }
            System.out.printf("средняя: %.4f", allSalaryKv / 4);


        }
    }
}
















             

 

























