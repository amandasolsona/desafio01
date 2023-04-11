package br.com.santander.coders.model;

import br.com.santander.coders.enums.TipoAlimentacao;
import br.com.santander.coders.enums.TipoLocomocao;

import java.math.BigDecimal;

public class Animal {

    private String especie;
    private TipoAlimentacao tipoAlimentacao;
    private TipoLocomocao tipoLocomocao;
    private Integer tamanho;
    private BigDecimal peso;

    public Animal(String especie, TipoAlimentacao tipoAlimentacao, TipoLocomocao tipoLocomocao,
                  Integer tamanho, BigDecimal peso) {
        this.especie = especie;
        this.tipoAlimentacao = tipoAlimentacao;
        this.tipoLocomocao = tipoLocomocao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoAlimentacao getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(TipoAlimentacao tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public TipoLocomocao getTipoLocomocao() {
        return tipoLocomocao;
    }

    public void setTipoLocomocao(TipoLocomocao tipoLocomocao) {
        this.tipoLocomocao = tipoLocomocao;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", tipoAlimentacao=" + tipoAlimentacao +
                ", tipoLocomocao=" + tipoLocomocao +
                ", tamanho=" + tamanho +
                ", peso=" + peso +
                '}';
    }
}
