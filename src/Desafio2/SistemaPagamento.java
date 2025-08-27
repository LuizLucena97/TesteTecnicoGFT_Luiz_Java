package Desafio2;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {

    //Classe pagamento
    public static class Pagamento {
        public void processarPagamento() {
            System.out.println("Processando pagamento genérico...");
        }
    }

    //Classe Cartão
    public static class PagamentoCartao extends Pagamento {
        @Override
        public void processarPagamento() {
            System.out.println("Processando pagamento via cartão...");
        }
    }

    //Classe Boleto
    public static class PagamentoBoleto extends Pagamento {
        @Override
        public void processarPagamento() {
            System.out.println("Gerando boleto bancário...");
        }
    }

    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoBoleto());
        pagamentos.add(new PagamentoCartao());

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
        }
    }
}
