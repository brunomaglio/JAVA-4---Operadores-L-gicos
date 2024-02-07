import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu salário: ");
        float salario = scanner.nextFloat();
        System.out.println("digite seu abono: ");
        float abono = scanner.nextFloat();

        float novosalario = salario + abono;

        System.out.println("seu novo salario: " + novosalario);
    }
}