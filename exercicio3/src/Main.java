import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu salário bruto? ");
        float salarioBruto = scanner.nextFloat();

        System.out.println("Qual o seu Adicional noturno? ");
        float adicionalNoturno = scanner.nextFloat();

        System.out.println("Quanto de horas extras? ");
        float horaExtra = scanner.nextFloat();

        System.out.println("Quanto de desconto? ");
        float desconto = scanner.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (5 * horaExtra) - desconto;

        System.out.println("Seu salário Liquido é: " + salarioLiquido);
    }
}