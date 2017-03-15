package FullMass;

public class Mass2 {
    public static void main(String[] args) {
        double[] mass1 = new double[10];
        mass1[0] = 0;
        mass1[1] = 1;
        mass1[2] = 2;
        mass1[3] = 3;
        mass1[4] = 4;
        mass1[5] = 5;
        mass1[6] = 6;
        mass1[7] = 7;
        mass1[8] = 8;
        mass1[9] = 9;

        for (int i = 1; i < mass1.length; i++) {
            if (mass1[i] % 3 == 0)
                System.out.println(mass1[i]);
        }
    }
}
