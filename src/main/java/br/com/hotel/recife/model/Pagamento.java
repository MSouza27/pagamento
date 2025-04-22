package br.com.hotel.recife.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



@Entity
@Table(name = "pagamento_hospedagem")
@Getter
@Setter
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String origemViagem;
    private String destinoViagem;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(nullable = false, updatable = false)
    private LocalDate dataInicioViagem;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(nullable = false, updatable = false)
    private LocalDate dataFimViagem;

    private Integer quantidadePessoas;
    private BigDecimal valorDiaria;

    private Long totalDiarias;
    private BigDecimal totalValorDiarias;
    private BigDecimal valorPorPessoa;


    @PrePersist
    @PreUpdate
    public void calcularValores(){
        calcularTotalDiarias();
        calcularTotalValorDiarias();
        calcularValorPorPessoa();

    }


    // Método para calcular a quantidade de diária;
    public void calcularTotalDiarias(){
        if (dataInicioViagem != null && dataFimViagem != null){
            this.totalDiarias = ChronoUnit.DAYS.between(dataInicioViagem, dataFimViagem);
        } else {
            this.totalDiarias = 0L;
        }

    }
    // Método para calcular o valor da viagem considerando os dias de hospedagem;
    public void calcularTotalValorDiarias(){
        if (totalDiarias != null && valorDiaria != null){
            this.totalValorDiarias = valorDiaria.multiply(BigDecimal.valueOf(totalDiarias));
        }else {
            this.valorPorPessoa = BigDecimal.ZERO;
        }
    }

    // Método para calcular o valor da viagem por pessoa;
    public BigDecimal calcularValorPorPessoa(){
        if (quantidadePessoas != null && quantidadePessoas >0 && totalValorDiarias != null){
            this.valorPorPessoa = totalValorDiarias.divide(BigDecimal.valueOf(quantidadePessoas), RoundingMode.CEILING);
        }else {
            this.valorPorPessoa = BigDecimal.ZERO;
        }
        return null;
    }
}
