package FullMass;

/**
 * Cоздайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на экран сообщение о том,
 * является ли массив строго возрастающей последовательностью.
 */
public class Mass12 {
    public static void main(String[] args) {
        int mass[] = new int[4];
        boolean strong = false;
        for (int i = 0; i < 4; i++) {
            mass[i] = (int) (Math.random() * 90 + 10);
            System.out.print(mass[i] + " ");
            if (i >= 1) {
                if (mass[i] <= mass[i - 1])
                    strong = false;
            }
        }
        System.out.println();
        if (strong)
            System.out.println("strong");
        else
            System.out.println("no strong");
    }
}
