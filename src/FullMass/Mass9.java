package FullMass;

/**
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
 * выведете это количество на экран на отдельной строке.
 */
public class Mass9 {
    public static void main(String[] args) {
        int counter = 0;
        int mass[] = new int[15];
        for (int i = 0; i < 15; i++) {
            mass[i] = (int) Math.round(Math.random() * 9);
            System.out.print(mass[i] + " ");
            if (mass[i] % 2 == 0)
                counter++;
        }
        System.out.println("\n" + counter);
    }
}
