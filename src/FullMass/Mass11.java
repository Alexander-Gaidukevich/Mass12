package FullMass;

/**
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее
 * арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние
 * арифметические равны).
 */
public class Mass11 {
    public static void main(String[] args) {
        int mass1[] = new int[5];
        int mass2[] = new int[5];
        double mid1 = 1, mid2 = 2;
        for (int i = 0; i < 5; i++) {
            mass1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + mass1[i];
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            mass2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + mass2[i];
            System.out.print(mass2[i] + " ");
        }
        mid1 = mid1 / 5;
        mid2 = mid2 / 5;
        System.out.println();
        if (mid1 < mid2)
            System.out.println("mid1<mid2");
        else if (mid1 > mid2)
            System.out.println("mid1>mid2");
        else if (mid1 == mid2)
            System.out.println("mid1==mid2");
    }
}
