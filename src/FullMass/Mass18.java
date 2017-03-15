package FullMass;

import java.util.Scanner;

/*
 *Пользователь вводит с клавиатуры натуральное число большее 3, которое  сохраняется в переменную n. Если пользователь ввёл не подходящее число,
 * то программа должна просить пользователя повторить ввод. Создать массив  из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 * Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class Mass18 {
    public static void main(String[] args) {

        int userNum = 0, minNumer = 3, oddArrIndex = 0;
        int[] randArr;
        int[] oddArr;

        boolean flag = true, oddFlag = true;
        do {
            Scanner str = new Scanner(System.in);
            if (str.hasNextInt()) {
                userNum = str.nextInt();
                if (userNum > minNumer) flag = false;
                else System.out.println("error");
            } else System.out.println("error");
        } while (flag);

        randArr = new int[userNum];

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int) (Math.random() * (userNum + 1));
            if (randArr[i] % 2 == 0) oddArrIndex++;
            System.out.print(randArr[i] + " ");
        }

        oddArr = new int[oddArrIndex];
        System.out.println();

        for (int i = 0, j = 0; i < oddArrIndex; i++) {
            do {
                oddFlag = true;
                if (randArr[j] % 2 == 0) {
                    oddArr[i] = randArr[j];
                    oddFlag = false;
                }
                j++;
            } while (oddFlag);
            System.out.print(oddArr[i] + " ");
        }
    }
}
