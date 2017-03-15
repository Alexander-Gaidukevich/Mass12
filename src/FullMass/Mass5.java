package FullMass;

public class Mass5 {
    public static void main(String[] args) {
        double[] mass1 = new double[]{2, 4, 6, 9, 0, 4, 3, 5, 8, 1, 7, -5, -7};

        int chet = 0;
        int noChet = 0;

        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 == 0) {
                chet = chet + 1;
            } else {
                noChet = noChet + 1;
            }
        }
        System.out.println("Chetnye chisla = " + chet);
        System.out.println("Ne chetnye chisla = " + noChet);
        System.out.println("Dlina massiva = " + mass1.length);

        if (chet > noChet) {
            System.out.println("четных больше");
            for (int i = 0; i < mass1.length; i++) {
                mass1[i] = mass1[i] * 2;
            }
        } else {
            System.out.println("нечетных больше");
            for (int i = 0; i < mass1.length; i++)
                mass1[i] = mass1[i] * 3;
        }
        for (int i = 0; i < mass1.length; i++)
            System.out.println(mass1[i]);
    }
}