public class Compra {

    // Método 1: cálculo simples
    // preco * quantidade
    public double calcularTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    // Método 2: com desconto (%)
    public double calcularTotal(double preco, int quantidade, double desconto) {

        // reutiliza o método anterior
        double total = calcularTotal(preco, quantidade);

        // calcula o desconto
        double valorDesconto = total * (desconto / 100);

        return total - valorDesconto;
    }
}