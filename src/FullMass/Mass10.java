package FullMass;

/**
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на
 * ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Mass10 {
    public static void main(String[] args) {
        int mass[] = new int[8];
        for (int i = 0; i < 8; i++) {
            mass[i] = (int) Math.round(Math.random() * 9 + 1);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0)
                mass[i] = 0;
            System.out.print(mass[i] + " ");
        }
    }
}
