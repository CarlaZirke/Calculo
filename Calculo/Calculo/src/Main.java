import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        Calculo calculo = new Calculo(nome, salarioBruto);

        double salarioLiquido = calculo.calcularSalarioLiquido();

        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + df.format (salarioBruto));
        System.out.println("Desconto INSS: " + df.format (calculo.calcularINSS()));
        System.out.println("Desconto Imposto de Renda: " + df.format (calculo.calcularImpostorenda()));
        System.out.println("Salário Líquido: " + df.format (salarioLiquido));

        }
    }
