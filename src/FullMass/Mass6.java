package FullMass;

public class Mass6 {
    public static void main(String[] args) {
        double[] mass1 = new double[]{2, 4, 6, 9, 0, 4, 3, 5, 8, 1, 7, -5, -7};

        double proiz = mass1[0] * mass1[mass1.length - 1]; // нахождение первого и последнего массива элемента
        int sered = mass1.length / 2;
        proiz = proiz * mass1[sered];
        System.out.println("Произведение  = " + proiz);
        System.out.println("Середина = " + sered);
    }
}
