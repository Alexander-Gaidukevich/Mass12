package FullMass;

/**
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных и положительных элементов там
 * было поровну и не было нулей. При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно
 * выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.). Вывести полученный
 * массив на экран.
 */
public class Mass17 {
    public static void main(String[] args) {
        int posMass[] = new int[6];
        int negMass[] = new int[6];
        int indexMass[] = new int[12];
        int resMass[] = new int[12];
        boolean markerIndex;
        int tempIdex;

        //<index>
        for (int i = 0; i < indexMass.length; i++) {
            indexMass[i] = 99999;
            do {
                tempIdex = (int) (Math.random() * 12);
                markerIndex = false;
                for (int j = 0; j < indexMass.length; j++) {
                    if (tempIdex == indexMass[j]) markerIndex = true;
                }
            } while (markerIndex);
            indexMass[i] = tempIdex;
        }
        //</index>

        for (int i = 0; i < posMass.length; i++) {
            posMass[i] = (int) (Math.random() * 10 + 1);
            negMass[i] = (int) (Math.random() * (-10) - 1);
        }

        for (int i = 0; i < resMass.length; i++) {
            if (i < 6) resMass[indexMass[i]] = posMass[i];
            if (i >= 6) resMass[indexMass[i]] = negMass[i - 6];
        }

        for (int i = 0; i < resMass.length; i++) {
            System.out.print(resMass[i] + " ");
        }
    }
}
