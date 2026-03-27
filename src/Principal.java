public class Principal {
    public static void main(String[] args) {

        // SOBRECARGA
        Compra compra = new Compra();

        double total1 = compra.calcularTotal(50, 2);
        double total2 = compra.calcularTotal(50, 2, 10);

        System.out.println("Total: " + total1);
        System.out.println("Com desconto: " + total2);

        // POLIMORFISMO

        // Caso base (sem polimorfismo)
        Pagamento p1 = new Pagamento();

        // Com polimorfismo
        Pagamento p2 = new PagamentoCartao();
        Pagamento p3 = new PagamentoPix();

        System.out.println("Base: " + p1.calcularPagamento(100));
        System.out.println("Cartão: " + p2.calcularPagamento(100));
        System.out.println("Pix: " + p3.calcularPagamento(100));
    }
}