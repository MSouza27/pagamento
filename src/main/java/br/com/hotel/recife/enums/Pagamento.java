package br.com.hotel.recife.enums;

public enum Pagamento {
    CARTAO_CREDITO("Cartão de Crédito"),
    CARTAO_DEBITO("Cartão de Débito"),
    BOLETO_BANCARIO("Boleto Bancário"),
    PIX("PIX"),
    ESPECIE("Pagamento em Espécie");

    Pagamento(String descricao) {

    }
}
