public class PagamentoPix extends Pagamento {

    public double calcularPagamento(double valor) {
        return valor+(valor*0.1);
    }

}