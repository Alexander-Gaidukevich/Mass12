package FullMass;

public class Mass3 {
    public static void main(String[] args) {
        double[] mass1 = new double[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        mass1[0] = 0;
//        mass1[1] = 1;
//        mass1[2] = 2;
//        mass1[3] = 3;
//        mass1[4] = 4;
//        mass1[5] = 5;
//        mass1[6] = 6;
//        mass1[7] = 7;
//        mass1[8] = 8;
//        mass1[9] = 9;

        double summa = 0;

        for (int i = 0; i < mass1.length; i++) {
            summa = summa + mass1[i];
        }
        System.out.println("summa = " + summa);

        double sr = summa / mass1.length;
        System.out.println("Srednee znachenie = " + sr);
    }
}
