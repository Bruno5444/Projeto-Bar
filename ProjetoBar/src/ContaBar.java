public class ContaBar {

    public double calcularConsumo(int quantidadeCervejas, int quantidadeRefrigerantes, int quantidadeEspetinhos) {
        double precoCerveja = 5.00;
        double precoRefrigerante = 3.00;
        double precoEspetinho = 7.00;
        return (quantidadeCervejas * precoCerveja) +
                (quantidadeRefrigerantes * precoRefrigerante) +
                (quantidadeEspetinhos * precoEspetinho);
    }

    public double calcularCouvert(double consumo) {
        return consumo > 30 ? 0.00 : 4.00;
    }

    public double calcularIngresso(char sexo) {
        return (sexo == 'F') ? 8.00 : 10.00;
    }

    public void gerarRelatorio(char sexo, int quantidadeCervejas,
                               int quantidadeRefrigerantes, int quantidadeEspetinhos) {
        double consumo = calcularConsumo(quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
        double couvert = calcularCouvert(consumo);
        double ingresso = calcularIngresso(sexo);

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        double valorAPagar = consumo + couvert + ingresso;
        System.out.printf("Valor a pagar = R$ %.2f%n", valorAPagar);
    }
}
