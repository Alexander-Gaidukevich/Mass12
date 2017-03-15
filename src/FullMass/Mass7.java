package FullMass;

/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого
 * пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет
 * размера. 2 4 6 … 18 20 2 4 6 … 20
 */
public class Mass7 {
    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 2, j = 0; i <= 20; i = i + 2, j++) {
            mass[j] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++)
            System.out.println(mass[i]);
    }
}
