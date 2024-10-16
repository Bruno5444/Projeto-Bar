import java.util.Scanner;

public class MainContaBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBar contaBar = new ContaBar();

        // Leitura de dados
        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        // Gera o relatório
        contaBar.gerarRelatorio(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
    }
}

