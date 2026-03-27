public class PagamentoCartao extends Pagamento {

    public double calcularPagamento(double valor) {
        return valor*1.02;
    }

}