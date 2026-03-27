📦 Exercício: Polimorfismo com Frete (E-commerce)

📌 Objetivo

Praticar o conceito de polimorfismo em Java utilizando um cenário real
de e-commerce, especificamente o cálculo de frete.

------------------------------------------------------------------------

🧠 Revisão rápida

Polimorfismo acontece quando usamos:

Entrega e = new EntregaExpressa();

👉 O método chamado é o mesmo, mas o comportamento muda dependendo do
objeto.

------------------------------------------------------------------------

🎯 Contexto

Em um sistema de e-commerce, o valor do frete pode variar de acordo com
o tipo de entrega escolhido pelo cliente.

Exemplos: - Entrega normal (valor fixo) - Entrega expressa (valor
baseado na compra)

------------------------------------------------------------------------

🧱 Classe base

class Entrega {

    double calcularFrete(double valorCompra) {
        return 0;
    }

}

------------------------------------------------------------------------

✏️ Sua tarefa

Crie duas novas classes que herdam de Entrega:

🚚 EntregaNormal

-   Frete fixo de R$ 10

⚡ EntregaExpressa

-   Frete de 10% do valor da compra

------------------------------------------------------------------------

▶️ Teste

Entrega e1 = new EntregaNormal(); Entrega e2 = new EntregaExpressa();

System.out.println(“Normal:” + e1.calcularFrete(100));
System.out.println(“Expressa:” + e2.calcularFrete(100));

------------------------------------------------------------------------

🧪 Saída esperada

Normal: 10.0 Expressa: 10.0

------------------------------------------------------------------------

🚀 Desafio

Crie a classe EntregaRetirada: - Frete gratuito (0)

------------------------------------------------------------------------

🎯 Conclusão

Você praticou polimorfismo em um cenário real de e-commerce.
