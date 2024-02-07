import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {

            System.out.println("Me de um número:");
            numeros[i] = scanner.nextInt();
        }

        int calculo = (numeros[0] * numeros[1]) - (numeros[2] * numeros[3]);

        System.out.println("O resultado do calculo é: " + calculo);
    }
}