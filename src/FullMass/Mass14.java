package FullMass;

/**
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите
 * индекс его последнего вхождения в массив.
 */
public class Mass14 {
    public static void main(String[] args) {
        int mass[] = new int[12];
        int max = 0, maxIndex = 0;
        for (int i = 0; i < 12; i++) {
            mass[i] = (int) (Math.round(Math.random() * 30 - 15));
            System.out.print(mass[i] + " ");
            if (i == 0) {
                max = mass[i];
                maxIndex = i;
            }
            if (i >= 1 && mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }
        }
        System.out.println("\n max= " + max + " index= " + maxIndex);
    }
}
