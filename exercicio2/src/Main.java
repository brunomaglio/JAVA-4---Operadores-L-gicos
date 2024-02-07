import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("qual sua nota " + (i + 1) + "? ");
            notas[i] = scanner.nextFloat();
        }

        float media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("Sua media é: " + media);

    }
}