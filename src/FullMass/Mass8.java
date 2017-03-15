package FullMass;

/**
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в
 * обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class Mass8 {
    public static void main(String[] args) {
        int mass[] = new int[50];
        for (int i = 1, j = 0; j < 50; i = i + 2, j++) {
            mass[j] = i;
            System.out.print(mass[j] + " ");
        }
        System.out.println();
        for (int i = 49; i != 0; i--)
            System.out.print(mass[i] + " ");
    }
}
