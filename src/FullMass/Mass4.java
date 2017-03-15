package FullMass;

public class Mass4 {
    public static void main(String[] args) {
        double[] mass1 = new double[]{2, 4, 6, 9, 0, 4, 3, 5, 8, 1, 7, -5, -7};

        int count = 0;

        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] > 5) {
                System.out.println(mass1[i]);
                count = count + 1;
            }
        }
        System.out.println("=============");
        System.out.println("count = " + count);
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] < 2) {
                mass1[i] = mass1[i] * 3;
            }
            System.out.println(mass1[i]);
        }
    }
}
