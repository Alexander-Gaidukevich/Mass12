package FullMass;

/*
 Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены последовательности равны единицам,
 * а каждый следующий — сумме двух предыдущих.
 */
public class Mass13 {
    public static void main(String[] args) {
        int temp = 0, a = 0, b = 1;
        int mass[] = new int[20];
        for (int i = 0; i < 20; i++) {
            temp = a;
            a = b;
            b = b + temp;
            mass[i] = b;
            System.out.print(mass[i] + " ");
        }
    }
}
