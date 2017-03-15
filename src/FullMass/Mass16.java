package FullMass;

/**
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой элемент встречается в массиве
 * чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
public class Mass16 {
    public static void main(String[] args) {
        int negCount = 0, zerCount = 0, plusCount = 0;
        int mass[] = new int[11];
        for (int i = 0; i < 11; i++) {
            mass[i] = (int) (Math.random() * 3) - 1;
            System.out.print(mass[i] + " ");
            if (mass[i] == -1)
                negCount++;
            else if (mass[i] == 0)
                zerCount++;
            else
                plusCount++;
        }
        System.out.println();
        if (negCount > zerCount && negCount > plusCount)
            System.out.println("neg max " + negCount);
        else if (zerCount > negCount && zerCount > plusCount)
            System.out.println("zer max " + zerCount);
        else
            System.out.println("plus max " + plusCount);
    }
}
